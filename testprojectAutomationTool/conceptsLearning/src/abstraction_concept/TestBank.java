package abstraction_concept;

public class TestBank {

	

	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();

		hdfc.credit_Amount();
		hdfc.debit_Amount();
		hdfc.bankLoan();
		hdfc.funds();
		
		
		Bank b = new HDFCBank(); //This is dynamic polymorphism
		b.bankLoan();
		b.credit_Amount();
		b.debit_Amount();
		b.funds();
		
		
		

	}

}
