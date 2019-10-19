package lesson2;

public class Queue1 {

	private class Node {
		public int data;
		public Node next;
		public Node prev;

		public Node(int data, Node prev, Node next) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

	}

	private Node top;
	private Node tail;

	public void push(int data) {
		Node node = new Node(data, null, null);
		if (tail == null) {
			tail = node;
			top = node;
		} else {
			node.next = tail;
			tail.prev = node;
			tail = node;

		}

	}

	public int pop() throws MyException {
		if (top == null) {
			throw new MyException("Значений нет!");
		}
		int result = top.data;
		
		top = top.prev;
		
		
		return result;
	}

	
	
	

}
