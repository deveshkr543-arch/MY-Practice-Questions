package recu.java;

public class searchinarr {
	public static void main(String[] args) {
		int[] arr= {4,5,2,6,8};
		int target=8;
		System.out.println(search(arr,target,0));
		System.out.println(findindex(arr,target,0));
	}
	static boolean search(int[] arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target||search(arr,target,index+1);
	}
	static int findindex(int[] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return findindex(arr,target,index+1);
	}

}
