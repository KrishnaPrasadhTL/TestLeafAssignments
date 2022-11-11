package assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 153;
		int calculated=0,remainder;
		int original = input;
		while (original!=0)
		{
			remainder = original % 10;
			calculated = calculated+(remainder * remainder * remainder);
			original= original / 10;
			
		}
		
		if(calculated == input)
		{
		System.out.println("Number is armstrong number");
		}
		else 
		{
			System.out.println("Not an armstrong number");
		}

	}

}
