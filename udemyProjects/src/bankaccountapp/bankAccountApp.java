package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class bankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		//Read a CSV File
		String file = "C:\\Users\\dinhn\\Desktop\\Udemy Projects\\NewBankAccounts.csv";
		List<String[]> newAccounts = utilities.CSV.readCSV(file);
		for (String[] i : newAccounts) {
			String name = i[0];
			String sSN = i[1];
			String accType = i[2];
			double initDeposit = Double.parseDouble(i[3]);
				
			
			if (accType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else {
				accounts.add(new Checking(name, sSN, initDeposit));	
			}
		}
		//Print out information
		for (Account i : accounts) {
			i.showInfo();
			System.out.println("****************");
		}
	}

}
