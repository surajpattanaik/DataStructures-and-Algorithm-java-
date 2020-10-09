package deque;

public class Main {
public static void main(String[] args) {
	myDeque<Integer> deque = new myDeque<Integer>();
	for (int i = 0; i < 10; i++) {
		deque.addToHead(i);	
	}
	System.out.println(deque.removeLast());
	System.out.println(deque.removeLast());
	System.out.println(deque.removeLast());
	
}
}
