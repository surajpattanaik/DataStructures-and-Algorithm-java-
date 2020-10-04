package Queue;
public class MainQueue {
 public static void main(String[] args){
	myQueue<Integer> queue = new myQueue<>();
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	queue.enqueue(4);
	queue.showAll();
    System.out.println("current size :"+queue.size());
    
    queue.dequeue();
    queue.dequeue();
    queue.showAll();
    System.out.println("current size :"+queue.size());
	
    queue.dequeue();
    queue.dequeue();
    queue.showAll();
    System.out.println("current size :"+queue.size());
	
}
}
