package Queue;
import LinkedList.MyLinkedList.*;
public class myQueue<E> {
	 private Node<E> head, rear;
	 public void enqueue(E e) {
		 Node<E> toAdd = new Node(e);
		 if (head == null) {
			 head = rear = toAdd;
			return;
		 }
		 rear.next=toAdd;
		 rear = rear.next;
		
		 
	 }
	 public E dequeue() {
		 if(head == null) {
			 return null;
		 }
		 
		 
		 Node<E> temp = head;
		 head = head.next;
		 
		 if (head == null) {
			 rear = null;
				
			}
		return temp.data;
		 
	 }
	 
	 public int size() {
		 if(head == null) {
			 return 0;
		 }
		 int s = 0;
		 Node<E> temp=head;
		 while(temp != null) {
			 temp = temp.next;
			 s++;
			 
		 }
		 return s;
		 
		 
	 }
	 
	 public void showAll() {
		 if(head == null) {
			 System.out.println("no element in the Queue");
		 }
		 
		 Node<E> temp=head;
		 while(temp != null) {
			 System.out.print(temp.data+" ");
			 temp = temp.next;
			 
			 
		 }
		 System.out.println();
		
	 }
	  
	 

}
