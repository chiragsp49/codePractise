package codePractise;

 //https://leetcode.com/problems/palindrome-linked-list/
//https://www.youtube.com/watch?v=yOzXms1J6Nk

public class palindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		slow=reverse(slow);
		fast=head;
		 while(slow!=null) {
			 if(slow.val!=fast.val) {
				 return false;
			 }
			 slow=slow.next;
			 fast=fast.next;
			 
		 }
		
		return false;
        
    }
	
	public ListNode reverse(ListNode head) {
		ListNode prev =null;
		while(head!=null) {
			ListNode next = head.next;
			head.next=prev;
			prev=head;
			head=next;
		}
		return prev;
	}
	
	// Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
}
