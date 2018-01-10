package hackerearth;

public class StringsExample {
public static void main(String args[]){
	String str = "hello";
	String str1  = "hello";
	String str2 = new String("hello");
	String str3 = new String(str1);
	System.out.println(str3==str1);
	System.out.println("str3===="+str3);
}
}
