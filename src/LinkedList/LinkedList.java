package LinkedList;

public class LinkedList{
	public Node head;
	
	public LinkedList(Node node) {
		this.head = node;
	}
	
	public LinkedList() {
		this.head = null;
	}
	
	public void addNode(int data) {
		Node tempNode = new Node(data);
		if(head == null) {
			head = tempNode;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = tempNode;
		}
	}
	
	public void printList() {
		Node temp = head;
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		while(temp.next!=null) {
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
