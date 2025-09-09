package recu.java;

import java.util.Arrays;

public class bubble {
	public static void main(String[] args) {
		int[] arr= {4,5,3,6,2};
		bubble1(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}
	static void bubble1(int[] arr,int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c+1];
				arr[c+1]=arr[c];
				arr[c]=temp;
			}
			bubble1(arr,r,c+1);
		}
		else {
		bubble1(arr,r-1,0);
		}
	}

}
