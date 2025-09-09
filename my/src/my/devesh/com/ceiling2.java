package my.devesh.com;

public class ceiling2 {
	public static void main(String[] args) {
		char[] letter= {'c','f','g','h','j'};
		char target='i';
		char ans=nextgreatestnumber(letter,target);
		System.out.println(ans);
	}
	static char nextgreatestnumber(char[] letter, char target) {
		int start=0;
		int end=letter.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(target<letter[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return letter[start%letter.length];
	}

}
