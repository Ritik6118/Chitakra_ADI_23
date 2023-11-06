package Sliding_Window;

public class Subarray_product_less_then_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int numSubarrayProductLessThanK(int[] arr, int k) {
        int si=0;
        int ei=0;
        int prod=1;
        int ans=0;
        while(ei<arr.length){
            prod*=arr[ei];
            while(prod>=k && si<=ei){
                prod/=arr[si];
                si++;
            }
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }

}
