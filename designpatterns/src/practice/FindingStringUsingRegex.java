package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingStringUsingRegex {
public static void main(String args[]){
	String str = "https://www.joyoftipping.com/android_app_link.html?click_id\u003dabcdef";
	//String str="utm_source=google-play&utm_medium=organic";
	Pattern pattern = Pattern.compile("//(.*?)/");
	Matcher matcher = pattern.matcher(str);
	if (matcher.find()) {
	    System.out.println(matcher.group(1));
	}
	
}
}
