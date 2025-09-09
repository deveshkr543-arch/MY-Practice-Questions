package my.devesh.com;

import java.util.Scanner;

public class devesh9 {
	public static void factorial(int n) {
		int f=1;
		for(int i=n;i>=1;i--) {
			f=f*i;
			
		}
		System.out.println(f);
		return;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		factorial(n);
	}

}
