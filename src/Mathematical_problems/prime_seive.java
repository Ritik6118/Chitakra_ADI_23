package Mathematical_problems;

public class prime_seive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr=new boolean [1000];
		for(int i=2;i<arr.length;i++) {
			arr[i]=true;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) {
				for(int j=i*i;j<arr.length;j+=i) {
					arr[j]=false;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) {
				System.out.println(i);
			}
		}
	}

}
