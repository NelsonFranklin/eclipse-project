package xcptn;

public class exceptionn {

	public static void main(String[] args) {
		System.out.println("normal output");
		try 
		{
		System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		System.out.println("after exception");
		}
	

}
