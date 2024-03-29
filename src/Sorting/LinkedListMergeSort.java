package Sorting;

import LinkedList.*;

public class LinkedListMergeSort {
	
	public static Node sort(Node h) {
		if(h == null || h.next==null) {
			return h;
		}
		Node middle = getMiddle(h);
		Node nextPart = middle.next;
		middle.next = null;
		Node left = sort(h);
		Node right = sort(nextPart);
		Node res = merge(left, right);
		
		return res;
	}
	
	public static Node getMiddle(Node h) {
		Node slowptr = h;
		Node fastptr = h;
		if(h == null || h.next==null) {
			return h;
		}
		while(fastptr.next!=null && fastptr.next.next!=null) {
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
		}
		return slowptr;
	}
	
	public static Node merge(Node left, Node right) {
		Node resHead = null;
			if(left == null) {
				return right;
			}
			if(right == null) {
				return left;
			}
			if(left.data <= right.data) {
				resHead = left;
				resHead.next = merge(left.next, right);
			}else {
				resHead = right;
				resHead.next = merge(left, right.next);
			}
		
		return resHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addNode(13);
		list.addNode(-1);
		list.addNode(10);
		list.addNode(4);
		list.addNode(2);
		list.printList();
		list.head = sort(list.head);
		list.printList();
	}

}
