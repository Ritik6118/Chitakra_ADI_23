package Sliding_Window;

import java.util.Scanner;

public class kartik_bhaiya_and_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int a=max_len(s,n,'a');
		int b=max_len(s,n,'b');
		System.out.println(Math.max(a,b));
	}

	private static int max_len(String s, int n, char ch) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int flip=0;
		int ans=0;
		while(ei<s.length()) {
//			window grow
			if(s.charAt(ei)==ch) {
				flip++;
			}
//			window_shrink
			while(flip>n && si<=ei) {
				if(s.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
//			ans calculate
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}

}
