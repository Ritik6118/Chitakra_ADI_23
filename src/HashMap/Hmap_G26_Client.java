package HashMap;

public class Hmap_G26_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HmapG26<String, Integer> map = new HmapG26<>();
		map.put("abc", 1);
		map.put("def", 2);
		map.put("ghi", 3);
		map.put("abc", 5);
		System.out.println(map.containsKey("abc"));

		map.remove("abc");
		System.out.println(map.containsKey("abc"));
		System.out.println(map);

	}

}
