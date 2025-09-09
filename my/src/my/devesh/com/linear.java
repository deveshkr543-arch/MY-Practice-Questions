package my.devesh.com;

public class linear {
	public static void main(String[] args) {
		int[] nums= {0,12,345,2,6,7896};
		//System.out.println(findnumber(nums));
		System.out.print(digits(234565));
	}
	static int findnumber(int[] nums) {
		int count=0;
		for(int num:nums) {
			if(even(num)) {
				count++;
				
			}
		}
		return count;
		
	}
	static boolean even(int num) {
		int numberofdigits=digits(num);
		if(numberofdigits%2==0) {
			return true;
		}
		return false;
	}
	static int digits(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
		
	}
	static int digits2(int num) {
		if(num<0) {
			num=num*-1;
		}
		return(int)(Math.log10(num))+1;
	}

}
