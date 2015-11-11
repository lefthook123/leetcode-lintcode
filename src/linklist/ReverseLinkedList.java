package linklist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static ListNode reverseList(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}
    	ListNode prev=null;
    	ListNode cur=head;
    	while(cur != null){
    		ListNode next=cur.next;
    		cur.next=prev;
    		prev=cur;
    		cur=next;
    	}
    	return prev;
    }

}
