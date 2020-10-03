public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomCollection col = new CustomCollection();
		col.add(1);
		col.add(2);
		col.add("s");
		col.add("u");
		col.add(1);
		col.add(2);
		col.add(null);
		col.add(null);
		col.add(10.9);
		col.add("lol");

		System.out.println("current capacity is " + col.capacity());
		System.out.println("array size is " + col.size());
		col.showAll();

		col.add(5);
		col.add(6);
		col.add("g");
		col.add("k");

		System.out.println("current capacity is " + col.capacity());
		System.out.println("array size is " + col.size());

		col.insertElement(5, "inserted el");
		System.out.println(col.getElement(5));

		col.replaceElement(5, "updated el");
		System.out.println(col.getElement(5));

		System.out.println(col.search("g"));
		System.out.println(col.search("i"));
		System.out.println(col.search(100));

		col.showAll();

	}

}
