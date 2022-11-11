package assignments;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		int range = 10;
		int sum, i;
		System.out.println(a);
		System.out.println(b);
		for (i=2; i <=range; i++)

			{
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}

	}

}
