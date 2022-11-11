package assignments;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5,4,6,7};
		Arrays.sort(arr);
		for(int i=0; i <arr.length; i++) {
			if(arr[i]!=i)
			{
				System.out.println(arr[i]);
			}
			
		}
		

	}

}
