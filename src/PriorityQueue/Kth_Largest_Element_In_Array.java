package PriorityQueue;

public class Kth_Largest_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i: nums){
            pq.add(i);
        }
        while(k-->1){
            pq.poll();
        }
        return pq.poll();
    }

}
