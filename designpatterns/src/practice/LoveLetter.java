package practice;

public class LoveLetter {
public static void main(String[] args){
	String s = "abcba";
	int c=0;
	for(int i=0,j=s.length()-1;i<j;i++,j--){
		c = c+ Math.abs(s.charAt(i)-s.charAt(j));
		
	}
	System.out.println(c);
}
}
