package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	//This function to read data from a CSV file and return as a list
	
	public static List<String[]> readCSV(String file){
		List<String[]> data = new LinkedList<>();
		String dataRow;
		
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));


				while ((dataRow = br.readLine()) != null) {
					String[] dataRecords = dataRow.split(",");
					data.add(dataRecords);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("No file found");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Cant read file");
				e.printStackTrace();
			}
			
		return data;
	}
}
