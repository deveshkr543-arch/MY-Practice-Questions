package my.devesh.com;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
