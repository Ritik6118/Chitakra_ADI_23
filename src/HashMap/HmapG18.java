package HashMap;

public class HmapG18<K,V> {
	class Node<K,V>{
		K key;
		V val;
		Node next;
		Node(K key,V val){
			this.key=key;
			this.val=val;
		}
	}
	Node[] arr;
	int size;
	HmapG18(int x){
		this.arr=new Node[x];
		this.size=0;
	}
	HmapG18(){
		this(4);
	}
	
	public void put(K key,V val) {
		int bn=hashfun(key);
		Node temp=arr[bn];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.val=val;
			}
			temp=temp.next;
		}
		Node nn=new Node(key,val);
		nn.next=arr[bn];
		arr[bn]=nn;
		size++;
				
	}
	
	public boolean containsKey(K key) {
		
	}
	
	public V get(K key) {
		
	}
	
	public V remove(K key) {
		int bn=hashfun(key);
		Node curr=arr[bn];
		Node prev=null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		if(curr==null) {
			return null;
		}
		if(prev==null) {
			arr[bn]=curr.next;
			curr.next=null;
		}
		else {
			prev.next=curr.next;
			curr.next=null;
		}
		size--;
		return (V) curr.val;
		
	}
	public int hashfun(K key) {
		int bn=key.hashCode()%arr.length;
		if(bn<0) {
			bn+=arr.length;
		}
		return bn;
	}
}
