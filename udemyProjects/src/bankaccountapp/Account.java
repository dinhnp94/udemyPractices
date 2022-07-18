package bankaccountapp;

public abstract class Account implements BaseInterest { //abstract because we wont use it directly 
	
	private String name;
	private String sSN;
	private String accType;
	private double initDeposit;
	private double balance;
	protected double rate;
	protected String accNum;
	private static int id = 10000;
	private int[] randBase = {0,1,2,3,4,5,6,7,8,9};
	
	//Constructor
	public Account (String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
	
		//Set account
		this.accNum = setAccNum();
		
		//get Base Rate
		setRate();
		
	}

	public abstract void setRate();
	
	//set account number
	private String setAccNum() {
		String temp = "";
		temp = temp + this.sSN.charAt(sSN.length()-2) + this.sSN.charAt(sSN.length()-1);
		temp = temp + id;
		id++;
		for (int i = 0; i < 3; i++) {
			int randNum = (int)(Math.random()*randBase.length);
			temp = temp + randBase[randNum];
		}
		return temp;
		
	}
	
	//Common methods transitions
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing $" + amount);
		checkBalance();
	}
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		checkBalance();
	}
	public void transfer(String toAccount, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toAccount);
		checkBalance();
	}
	
	
	public void checkBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println("NAME: " + name);
		System.out.println("ACCOUNT NUMBER: " + accNum);
		System.out.println("ACCOUNT BALANCE: " + balance);
		System.out.println("ACCOUNT RATE: " + rate +"%");
	}
	
	public int setPin() {
		return (int)(Math.random()*Math.pow(10, 4));
	}

}
