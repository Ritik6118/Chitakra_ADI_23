package Binary_Search;

public class Capacity_to_Ship_Packages_Within_D_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int shipWithinDays(int[] arr, int days) {
        int lo=-1;
        int hi=0;
        for(int i=0;i<arr.length;i++){
            lo=Math.max(lo,arr[i]);
            hi+=arr[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(arr,days,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{   
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] arr, int days, int cap){
        int day=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
            if(count>cap){
                count=arr[i];
                day++;
            }
            if(day>days){
                return false;
            }
        }
        return true;
    }
}
