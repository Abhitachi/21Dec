package javatap;
import java.util.Arrays;
import java.util.Scanner;
public class FindingIntersectionOfTwoArrays {

	public static void findIntersection(int[] nums1,int[] nums2) {
		int i=0;
		int j=0;
		
		while(i<nums1.length && j<nums2.length) {
			while((i<nums1.length-1) && (nums1[i]==nums1[i+1])) {
				i++;
			}
			
			while((j<nums2.length-1) && nums2[j]==nums2[j+1]) {
				j++;
			}
			
			if(nums1[i]==nums2[j]) {
				System.out.println(nums1[i]);
				i++;j++;
			}
			
			else if(nums1[i]<nums2[j]) {
				i++;
			}
			
			else if(nums1[i]>nums2[j]) {
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] nums1=new int[n];
		int[] nums2= new int[m];
		
		for(int i=0;i<nums1.length;i++) {
			nums1[i]=sc.nextInt();
		}
		
		for(int j=0;j<nums2.length;j++) {
			nums2[j]=sc.nextInt();
		}
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		findIntersection(nums1,nums2);
		
		
//		boolean notfound=false;
//		
//		for(int j=0;j<nums2.length;j++) {
//			if((j<nums2.length-1)&&nums2[j]==nums2[j+1] && notfound==false) {
//				j++;
//			}
//			notfound=false;
////			try {
//			for(int i=0;i<nums1.length;i++) {
//				if((i<nums1.length-1)&&nums1[i]==nums1[i+1] && notfound==false) {
//					i++;
//				}
//				
//				if(nums2[j]==nums1[i] && notfound==false) {
//					notfound=true;
//					System.out.println(nums2[j]); 
//					
//				}
//			}
////			}catch(Exception e) {
////				e.printStackTrace();
////				System.out.println("error ocuured");
////			}
//			
//		}
	}

}
