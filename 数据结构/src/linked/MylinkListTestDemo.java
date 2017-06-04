package linked;

public class MylinkListTestDemo {
	public static void main(String[] args) {
		MyLinkedList list  = new MyLinkedList();
		list.addFirst("A");
		list.addLast("B");
		list.addLast("C");  
		list.addLast("D");
		list.addLast("E");
		System.out.println(list);
		//list.remove("A");
		list.remove("C");
		//list.remove("E");
		
		System.out.println(list);
	
	}
}
