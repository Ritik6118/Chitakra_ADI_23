package Binary_Search;

public class Minimum_number_of_days_to_make_m_bouquets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minDays(int[] arr, int m, int k) {
        if(m>arr.length){
            return -1;
        }
        int lo=Integer.MAX_VALUE;
        int hi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            lo=Math.min(arr[i],lo);
            hi=Math.max(arr[i],hi);
        }
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(arr,mid,m,k)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] arr,int day,int m,int k){
        int c=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                c++;
            }
            else{
                b+=c/k;
                c=0;
            }
        }
        b+=c/k;
        // System.out.println(day+" "+b+" "+m);
        return b>=m;
    }

}
