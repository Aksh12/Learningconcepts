package abstraction_concept;

public abstract class Bank {
	
	public Bank() {
		//System.out.println("Constructor defined in bank");
	}

	public abstract void bankLoan();//only method is declared
	
	// We achieve partial Abstraction. 
	//Abstract class can have abstract and non abstract method
    //Abstraction mean : to hide the implementation logic !!
	//Cannot create the object of Abstract class
	
	//Non Abstract methods
	public void debit_Amount() {
		System.out.println("Bank -- Debit");
	}
	
	public void credit_Amount() {
		System.out.println("Bank Credi");
	}
	
	public void funds() {
		System.out.println("Bank -- funds");
	}


}
