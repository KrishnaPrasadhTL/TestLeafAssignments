package assignments;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first[] = {1,5,7,11,25,54};
		Arrays.sort(first);
		int arraylenght = first.length;
		System.out.println(first[arraylenght-2]);
		
		
	}

}
