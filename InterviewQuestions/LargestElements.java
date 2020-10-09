//question: Given an array of N positive integers, print k largest elements from the array.
//The o/p should be in decreasing order.

package InterviewQuestions;

import java.util.*;

public class LargestElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int k=sc.nextInt();
			int a[] =new int[n];
			for (int i = 0; i < n; i++) {
				a[i] =sc.nextInt();
			}
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for (int i = 0; i < n; i++) {
				if (i<k) {
					pq.add(a[i]);
					
				} else {
					if (pq.peek() < a[i]) {
						pq.poll();
						pq.add(a[i]);
					}
				}
			}
			ArrayList<Integer> ans = new ArrayList<Integer>(pq);
			Collections.sort(ans, Collections.reverseOrder());
			for(int x:ans) {
				System.out.print(x+" ");
			}
			System.out.println();
			
		}
	    
		

	}
}
