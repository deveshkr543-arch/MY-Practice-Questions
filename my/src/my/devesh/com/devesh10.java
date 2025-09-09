package my.devesh.com;

public class devesh10 {
	public static void main(String args[]){
		String firstname="tony";
		String lastname="stark";
		String fullname= firstname+"@"+lastname;
		System.out.println(fullname.length());
		
		for(int i=0;i<fullname.length();i++) {
			System.out.println(fullname.charAt(i));
		}
	}

}
