package PriorityQueue;

public class Kth_Largest_Element_In_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class KthLargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k=0;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
