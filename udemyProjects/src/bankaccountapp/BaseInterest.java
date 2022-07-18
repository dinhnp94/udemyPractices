package bankaccountapp;

public interface BaseInterest {
	//Return BaseInterest
	default double getBaseRate() {
		return 2.0; //for example
	}
}
