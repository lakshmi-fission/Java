package practice;

import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String args[]){
	String input = "ryrtuuu";
	//Pattern pattern = Pattern.compile("^\\d{10,15}$");
	//Pattern pattern = Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{10,15}$");
	Pattern pattern = Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{10,15}$");
	if (pattern.matcher(input).find()) {
	    System.out.println("Valid");
	}
	else{
		System.out.println("NotValid");
	}
	}
}
