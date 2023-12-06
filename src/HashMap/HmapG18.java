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
				return;
			}
			temp=temp.next;
		}
		Node nn=new Node(key,val);
		nn.next=arr[bn];
		arr[bn]=nn;
		size++;
		double thf=2.0;
		double lf=(1.0*size)/arr.length;
		if(lf>thf) {
			rehashing();
		}
		
	}
	
	private void rehashing() {
		// TODO Auto-generated method stub
		Node [] oa=this.arr;
		Node [] na=new Node[2*arr.length];
		this.arr=na;
		size=0;
		for(Node n: oa) {
			while(n!=null) {
				this.put((K)n.key,(V)n.val);
				n=n.next;
			}
		}
		
	}
	public boolean containsKey(K key) {
		int bn=hashfun(key);
		Node temp=arr[bn];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public V get(K key) {
		int bn=hashfun(key);
		Node temp=arr[bn];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return (V)temp.val;
			}
			temp=temp.next;
		}
		return null;
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
	
	@Override
	public String toString() {
		String s="";
		for(Node n: arr) {
			while(n!=null) {
				s+=n.key+" "+n.val+"\n";
				n=n.next;
			}
		}
		return s;
	}
}
