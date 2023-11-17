package Binary_Search;

public class search_in_rotated_sorted_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean search(int[] arr, int target) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]==arr[hi]&&arr[mid]==arr[lo]){
                lo+=1;
                hi-=1;
            }
            else if(arr[mid]<=arr[hi]){
                if(arr[mid]<=target && target<=arr[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
            else{
                if(arr[lo]<=target && target<=arr[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
        }
        return false;
    }

}
