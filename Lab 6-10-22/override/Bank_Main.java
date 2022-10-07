package corejava_eclipse;

public class Bank_Main {

	public static void main(String[] args) 
	{
		BankInterest b1 = new BankInterest();
		b1.interest();
		
		b1 = new SBIBank();
		b1.interest();
		
		b1 = new AxisBank();
		b1.interest();
		
		b1 = new IciciBank();
		b1.interest();
		
		
	}

}
