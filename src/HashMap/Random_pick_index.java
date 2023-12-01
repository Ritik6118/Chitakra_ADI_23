package HashMap;

public class Random_pick_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
	    int idx=0;
	    public Solution(int[] arr) {
	        for(int i=0;i<arr.length;i++){
	            if(map.containsKey(arr[i])){
	                map.get(arr[i]).add(i);
	            }
	            else{
	                ArrayList<Integer> li=new ArrayList<Integer>();
	                li.add(i);
	                map.put(arr[i],li);
	            }
	        }
	    }
	    
	    public int pick(int target) {
	        return map.get(target).get(idx++ % map.get(target).size());
	    }
	}

}
