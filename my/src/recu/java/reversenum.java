package recu.java;

public class reversenum {
	public static void main(String[] args) {
		reve(2345);
		System.out.println(sum1);
		 
	}
	static int sum1=0;
	static void reve(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		 sum1=sum1*10+rem;
		 reve(n/10);
	}

}
