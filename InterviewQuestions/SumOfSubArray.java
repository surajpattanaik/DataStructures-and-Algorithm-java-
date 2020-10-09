
//returns true if there exist a sub array inside the main array in which the sum of all the digits is equal to k.
package InterviewQuestions;

import java.util.*;

public class SumOfSubArray {

	public static void main(String[] args) {

		// approach 1
//		
//		int[] a = {2,3,1,-6};
//		boolean found = false;
//		int k = 6;
//		int sum=0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				
//				sum += a[j];
//				if (sum == k) {
//					found = true;
//					break;
//				}
//				
//			}
//		}
//		
//		System.out.println("Found "+found);
//	

		// approach 2
		int[] a = { 2, 3, 1, -6 };
		boolean found = false;

		Set<Integer> set = new HashSet();
		int k = 6;
		int sum = 0;
		for (int element : a) {
			set.add(sum);
			sum += element;
			if (set.contains(k)) {
				found = true;
				break;
			}
		}
		// System.out.println(set);
		System.out.println("Found " + found);
	}
}
