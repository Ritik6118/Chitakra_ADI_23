package Binary_Search;

public class min_in_rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findMin(int[] arr) {
        int lo=0;
        int hi=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[lo]<=arr[mid]){
                ans=Math.min(ans,arr[lo]);
                lo=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                hi=mid-1;
            }
        }
        return ans;
    }

}
