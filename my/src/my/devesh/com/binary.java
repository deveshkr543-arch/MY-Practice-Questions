package my.devesh.com;

public class binary {
	public static void main(String[] args) {
		int[] arr= {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int target=22;
		int ans=orderagnosticbs(arr,target);
		System.out.println(ans);
	}
	static int orderagnosticbs(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		boolean isasc=arr[start]<arr[end];
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
				
			}
			if(isasc) {
				if(target<arr[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			else {
				if(target>arr[mid]) {
					end=mid-1;
					
				}
				else {
					start=mid+1;
							
				}
			}
		}
		return -1;
	}

}
