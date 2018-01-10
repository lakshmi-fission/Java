package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	public static void main(String args[]){
		String password = "abc@de1";
		String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m =p.matcher(password);
		if(m.find()){
			System.out.println("true");
			}
		else{
			System.out.println("false");
		}
		}
	}

