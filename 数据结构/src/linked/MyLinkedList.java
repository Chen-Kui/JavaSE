package linked;

//����˫���б�
public class MyLinkedList {
	private Node first;// ����ĵ�һ���ڵ�
	private Node last;// �����е����һ���ڵ�
	private int size;// �ڵ������

	// �����е�ÿһ���ڵ�
	class Node {
		Node prev;// ��һ���ڵ����
		Node next;// ��һ���ڵ����
		Object ele;// ��ǰ�ڵ��д洢������

		public Node(Object ele) {
			this.ele = ele;
		}
	}

	public void addLast(Object ele) {
		Node node = new Node(ele);// ��Ҫ����Ľڵ����
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// �������ڵ���Ϊ֮ǰ�����һ���ڵ����һ���ڵ�
			this.last.next = node;
			// ��֮ǰ�����һ���ڵ���Ϊ�����ڵ����һ���ڵ�
			node.prev = this.last;
			// �������ڵ���Ϊ���һ���ڵ�
			this.last = node;
		}
		size++;
	}

	public void addFirst(Object ele) {
		Node node = new Node(ele);// ��Ҫ����Ľڵ����
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// ��֮ǰ�ĵ�һ���ڵ���Ϊ�����ڵ����һ���ڵ�
			node.next = this.first;
			// �������ӵĽڵ���Ϊ֮ǰ�ĵ�һ���ڵ����һ���ڵ�
			this.first.prev = node;
			// �������ڵ���Ϊ��һ���ڵ�
			this.first = node;
		}
		size++;
	}

	public void remove(Object ele) {
		//�ҵ���ɾ���Ľڵ�
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele	)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}
		//ɾ���ڵ�
		if(current==first){	
		this.first = current.next;
		this.first.prev = null;
		}else if(current==last){
			this.last =current.prev;
			this.last.next =null;	
		}else{
			//ɾ����ǰ�ڵ����һ���ڵ����ɾ����ǰ�ڵ��ǰһ���ڵ��next
			current.prev.next=current.next;
			//ɾ����ǰ�ڵ��ǰһ���ڵ����ɾ����ǰ�ڵ����һ���ڵ��prev
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
