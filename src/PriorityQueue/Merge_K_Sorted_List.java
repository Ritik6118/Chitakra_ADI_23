package PriorityQueue;

public class Merge_K_Sorted_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        });

        for(ListNode n:lists){
            while(n!=null){
                pq.add(n);
                n=n.next;
            }
        }
        ListNode dummy=new ListNode();
        ListNode head=dummy;

        while(pq.size()!=0){
            dummy.next=pq.poll();
            dummy=dummy.next;
        }
        dummy.next=null;
        return head.next;
    }

}
