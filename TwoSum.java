package javatap;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {

	 public static void pairedElements(int arr[], int sum) {

	        int low = 0;

	        int high = arr.length - 1;


	        while (low < high) {

	            if (arr[low] + arr[high] == sum) {

	             System.out.println("The pair is : (" + arr[low] + ", " + arr[high] + ")");

	            } if (arr[low] + arr[high] > sum) {

	                high--;

	            } else {

	                low++;

	            }
	        }
	 }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		int sum=8;
		
		pairedElements(a,sum);
	}

}
