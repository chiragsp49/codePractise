package codePractise;

public class IterativeReverseLinkedList {
	private Node head;
	
	private static class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
		
	}
	
	public void addToLast(Node node) {
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void printList(Node head) {
		Node temp = head;
		while(temp.next!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node head= new Node(5);
		
	}
}
