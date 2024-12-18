
public class LogicalOperatorOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OR is false only when both are false else true
		
		int salary= 101;
		int cibilscore= 100;
		if (salary>100 || cibilscore >150)
		{
			System.out.println("Eligible for loan");
		}
		else 
		{
			System.out.println("Not Eligible for loan");
		}
	}

}
