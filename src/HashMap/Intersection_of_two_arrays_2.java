package HashMap;

public class Intersection_of_two_arrays_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums1) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i: nums2){
            if(map.containsKey(i) && map.get(i)>0){
                li.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }
        return arr;
    }

}
