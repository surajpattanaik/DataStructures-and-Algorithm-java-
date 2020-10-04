package Stacks;

public class Mainstack {

	public static void main(String[] args) throws Exception {

		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);


    // delete the top element of the stack.
		int popped = stack.pop();

    //print the last popped element of the stack.
		System.out.println("popped element "+popped);

    //print the top element of the stack.
		int peeked = stack.peek();
		

		System.out.println("peeked element "+peeked);
		
		System.out.print("Elements of the stack: ");
		stack.printAll();
		System.out.println(stack.searchElement(2));

	}

}