package linked;

//基于双向列表
public class MyLinkedList {
	private Node first;// 链表的第一个节点
	private Node last;// 链表中的最后一个节点
	private int size;// 节点的数量

	// 链表中的每一个节点
	class Node {
		Node prev;// 上一个节点对象
		Node next;// 下一个节点对象
		Object ele;// 当前节点中存储的数据

		public Node(Object ele) {
			this.ele = ele;
		}
	}

	public void addLast(Object ele) {
		Node node = new Node(ele);// 需要保存的节点对象
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// 把新增节点作为之前的最后一个节点的下一个节点
			this.last.next = node;
			// 把之前的最后一个节点作为新增节点的上一个节点
			node.prev = this.last;
			// 把新增节点作为最后一个节点
			this.last = node;
		}
		size++;
	}

	public void addFirst(Object ele) {
		Node node = new Node(ele);// 需要保存的节点对象
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// 把之前的第一个节点作为新增节点的下一个节点
			node.next = this.first;
			// 把新增加的节点作为之前的第一个节点的上一个节点
			this.first.prev = node;
			// 把新增节点作为第一个节点
			this.first = node;
		}
		size++;
	}

	public void remove(Object ele) {
		//找到被删除的节点
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele	)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}
		//删除节点
		if(current==first){	
		this.first = current.next;
		this.first.prev = null;
		}else if(current==last){
			this.last =current.prev;
			this.last.next =null;	
		}else{
			//删除当前节点的下一个节点等于删除当前节点的前一个节点的next
			current.prev.next=current.next;
			//删除当前节点的前一个节点等于删除当前节点的下一个节点的prev
			 current.next.prev = current.prev;
		}	
		size--;
	}

	public String toString(	) {
		if (size == 0) {
			return "[]";
		}
		Node current = this.first;
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			current = current.next;
		}

		return sb.toString();
	}

}
