package codePractise;

public class AddTwoNumbers {
	//https://leetcode.com/problems/add-two-numbers/submissions/
//https://www.youtube.com/watch?v=aM4Iv7eEr2o
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        
        int carry =0;
        while(l1!=null || l2!=null) {
        	int l1_val = (l1!=null)?l1.val:0;
        	int l2_val = (l2!=null)?l2.val:0;
        	
        	int sum = l1_val+l2_val+carry;
        	carry = sum/10;
        	int last_digit = sum%10;
        	ListNode newNode = new ListNode(last_digit);
        	l3.next = newNode;
        	
        	if(l1!=null) l1=l1.next;
        	if(l2!=null) l2=l2.next;
        	l3=l3.next;
        	
        }
        
        if(carry>0) {
        	ListNode newNode = new ListNode(carry);
        	l3.next = newNode;
        	l3=l3.next;
        }
        
        return l3;
    }
}
