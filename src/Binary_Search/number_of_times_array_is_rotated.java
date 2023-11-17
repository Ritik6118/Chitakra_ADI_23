package Binary_Search;

public class number_of_times_array_is_rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int findKRotation(int arr[], int n) {
        // code here
        int lo=0;
        int hi=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int idx=arr.length;
        while(lo<=hi){
            
            int mid=lo+(hi-lo)/2;
            if(arr[lo]<=arr[mid]){
                if(arr[lo]<ans){
                    idx=lo;
                    ans=arr[lo];
                }
                lo=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    idx=mid;
                    ans=arr[mid];
                }
                hi=mid-1;
            }
        }
        return idx;
    }

}
