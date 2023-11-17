package Sliding_Window;

public class longest_subarray_without_repeatng_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[256];
        int si=0;
        int ei=0;
        int len=s.length();
        int ans=0;
        while(ei<len){
            freq[s.charAt(ei)]++;
            while(freq[s.charAt(ei)]>1 && si<=ei){
                freq[s.charAt(si)]--;
                si++;
            }
            // System.out.println(si+" "+ei);
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }

}
