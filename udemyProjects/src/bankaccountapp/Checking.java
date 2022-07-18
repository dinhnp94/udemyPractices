package bankaccountapp;

public class Checking extends Account {
	private long debitCardNum;
	private int debitCardPin;
	private long debitCardNumBase = 100000000000L;
	
	//Constructor
	public Checking (String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accNum = "2" + accNum;
		
	//set debit card number
	this.debitCardNum = debitCardNumBase;
	debitCardNumBase++;
	
	// set debit card Pin
	this.debitCardPin = setPin();
	
	//set rate . This is one way
	//setRate(); 
	}
	
	
	@Override // This is another way
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	
	
	//Show Info override
		public void showInfo() {
			super.showInfo();
			System.out.println("ACCOUNT TYPE: Checking");
			
			
		}
}
