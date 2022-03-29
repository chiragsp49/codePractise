package codePractise;

public class CreateAndPrintLinkedList {
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
		System.out.println(temp.value);
	}
	
	public static void main(String[] args) {
		CreateAndPrintLinkedList linkedList = new CreateAndPrintLinkedList();
		Node head= new Node(5);
		linkedList.addToLast(head);
		linkedList.addToLast(new Node(4));
		linkedList.addToLast(new Node(3));
		linkedList.addToLast(new Node(2));
		linkedList.addToLast(new Node(1));
		
		linkedList.printList(head);
		
	}
}
