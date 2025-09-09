package recu.java;

public class fecto {
	public static void main(String[] args) {
		int ans=fectorial(5);
		System.out.println(ans);
	}
	static int fectorial(int n) {
		if(n==1) {
		return 1;
		}
		return n*fectorial(n-1);
	}

}
