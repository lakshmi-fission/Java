package practice;

public class AddingToString extends AbstractExample {
public static void main(String args[]){
	String input = "546";
	String input1 = input.charAt(0)+"'";
	String input2 = input1+input.substring(1, input.length())+"\"";
	System.out.println("output========="+input2);
	int y = AbstractExample.x = 5;
	AddingToString addingString = new AddingToString();
	System.out.println(y);
	System.out.println(addingString.b);
	
}
}
