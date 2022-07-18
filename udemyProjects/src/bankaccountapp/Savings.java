package bankaccountapp;

public class Savings extends Account {
	private int safetyDepositBox;
	private int safetyDepositBoxPin;
	private static int safetyDepositBoxBase = 100;
	//Constructor
	public Savings (String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accNum = "1" + accNum;
		
		//set safety deposit box
		this.safetyDepositBox = this.safetyDepositBoxBase;
		safetyDepositBoxBase++;
		
		//set safety deposit box key
		this.safetyDepositBoxPin = setPin();
		
		//set rate
		//setRate();
	}
	
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	//Show Info override
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings");
		
	}
}
