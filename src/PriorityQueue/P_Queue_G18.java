package PriorityQueue;

public class P_Queue_G18<V> {
	class Node<V>{
		int priority;
		V val;
		Node next;
		
		Node(int priority , V val){
			this.priority=priority;
			this.val=val;
		}
	}
	
	Node head;
	int size;
	
	public void enque(int priority, V val) {
		Node curr=head;
		Node prev=null;
		while(curr!=null) {
			if(curr.priority<priority) {
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		Node nn=new Node(priority,val);
		if(prev==null) {
			nn.next=head;
			this.head=nn;
		}
		else {
			prev.next=nn;
			nn.next=curr;
		}
		size++;
	}
	
	public V deque() {
		Node temp=head;
		head=head.next;
		temp.next=null;
		size--;
		return (V)temp.val;
	}
	
	public V peek() {
		return (V)head.val;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		String s="";
		Node n=head;
		while(n!=null) {
			s+=n.val+" ("+n.priority+") ";
			n=n.next;
		}
		return s;
	}

}
