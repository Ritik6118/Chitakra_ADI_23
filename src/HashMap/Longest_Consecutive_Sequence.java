package HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	class Solution {
	    public int longestConsecutive(int[] nums) {
	        HashSet<Integer> set=new HashSet<>();
	        for(int i: nums){
	            set.add(i);
	        }
	        int ans=0;
	        for(int i: set){
	            if(set.contains(i-1)==false){
	                int c=0;
	                int n=i;
	                while(set.contains(n)){
	                    c++;
	                    n++;
	                }
	                ans=Math.max(ans,c);
	            }
	        }
	        return ans;
	    }
	}

}
