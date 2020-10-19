package lists;

import java.util.ArrayList;

public class MyArrayList extends ArrayList {

	static ArrayList<Object> al = new MyArrayList();

	public static void main(String[] args) {

		// method to add the element in the list
		System.out.println(fruits.add("S1"));
		System.out.println(fruits.add("S2"));
		System.out.println(fruits.add("S3"));

		System.out.println(fruits.add("S4"));
		System.out.println(fruits.add("sss"));
		System.out.println(fruits.add("zzz"));
		System.out.println(fruits.add("lll"));
		System.out.println(fruits.add("sss"));
		System.out.println(fruits.add(5));
		System.out.println(fruits.add(6));
		System.out.println(fruits.add(5));
		System.out.println(fruits.add("s4"));
		

		System.out.println();
		for (Object o : al) {
			System.out.print(" " + o);
		}

		((MyArrayList) al).deleteDuplicates();

		System.out.println();
		for (Object o : al) {
			System.out.print(" " + o);
		}
	}

	// method to delete all duplicate values from ArrayList
	public void deleteDuplicates() {
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {

				if (al.get(i).equals(al.get(j))) {
					al.remove(j);

				}
			}
		}
	}
	/*
	 * //method to stop adding duplicate values
	 * 
	 * @Override 
	 * public boolean add(Object e) {
	 * if (!al.contains(e)) { return super.add(e); } else { return false; }
	 * 
	 * 
	 * }
	 */

}
