package linklist;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null && l2 == null) return null;
    	else if(l1 == null) return l2;
    	else if(l2 == null) return l1;
    	ListNode dummy=new ListNode(0);
    	ListNode run=dummy;
    	while(l1 != null && l2 != null){
    		if(l1.val<l2.val){
    			run.next=l1;
    			l1=l1.next;
    		}
    		else{
    			run.next=l2;
    			l2=l2.next;
    		}
    		run=run.next;
    	}
    	if(l1 != null){
    		run.next=l1;
    	}
    	if(l2 != null){
    		run.next=l2;
    	}
    	return dummy.next;
    }
}
