package assignments;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {34,45,56,75,88,99,74};
		int arr2[] = {44,22,11,33,88,74,95};
        for (int i=0; i< arr1.length; i++) {
        	for (int j =0; j< arr2.length; j++) {
        		if(arr1[i] == arr2[j]) {
        			System.out.println("The intersection is " + arr2[j]);
        		}
        			
        	}
        }
	}

}
