package my.devesh.com;

public class string1 {
	public static void main(String[] args) {
		System.out.println(reverseWords("i.like.this.program.very.much"
));
	}
	static String reverseWords(String S)
	    {
	        // code here
	        String[] words=S.split("\\.");
	        System.out.println(words.length);
	        StringBuilder sb=new StringBuilder();
	        for(int i=words.length-1;i>=0;i--){
	            sb.append(words[i]);
	            sb.append(".");
	        }
	        return sb.toString();
	    }

}
