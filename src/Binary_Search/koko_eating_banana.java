package Binary_Search;

public class koko_eating_banana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int minEatingSpeed(int[] arr, int h) {
        int lo=1;
        int hi=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>hi){
                hi=arr[i];
            }
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isValidRate(arr,h,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isValidRate(int[] arr,int h,int rate){
        int time=0;
        for(int i=0;i<arr.length;i++){
            time+=arr[i]/rate;
            if(arr[i]%rate!=0){
                time+=1;
            }
            if(time>h){
                return false;
            }
        }
        return true;

    }

}
