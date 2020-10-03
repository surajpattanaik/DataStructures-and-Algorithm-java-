import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {

		MyLinkedList<Integer> myLL = new MyLinkedList();


		for (int i = 0; i < 10; i++) {
			// add method use to add a element in the last node of the linked list
        myLL.add(i);

		}
           // print method use to print the linked list
		myLL.print();

       System.out.println(myLL.search(9));


	}

}
