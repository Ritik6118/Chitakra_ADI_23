package Sliding_Window;

public class Minumum_size_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minSubArrayLen(int target, int[] arr) {
        int lo=0;
        int hi=arr.length;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(arr,mid,target)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] arr,int len,int target){
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=arr[i];
        }
        if(sum>=target){
            return true;
        }
        for(int ei=len;ei<arr.length;ei++){
            int si=ei-len;
            sum+=arr[ei];
            sum-=arr[si];
            if(sum>=target){
                return true;
            }

        }
        return false;
    }

}
