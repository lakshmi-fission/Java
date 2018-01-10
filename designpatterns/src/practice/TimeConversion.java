package practice;

import java.util.Scanner;

public class TimeConversion {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
    String s = in.next();
    int length = s.length();
     if(s.substring(length-2, length).equalsIgnoreCase("AM")){
    	 if(s.substring(0, 2).equalsIgnoreCase("12")){
    		 String target1 = s.replace(s.substring(0, 2), "00");
    		 System.out.println(target1.substring(0,length-2));
    	 }
    	 else{
    		 System.out.println(s.substring(0, length-2));
    	 }
     }
     else{
    	 if(s.substring(0, 2).equalsIgnoreCase("12")){
    		 System.out.println(s.substring(0,length-2));
    	 }
    	 else{
    	int output = Integer.parseInt(s.substring(0, 2))+12;
        String target = s.replace(s.substring(0, 2),Integer.toString(output));
    	System.out.println(target.substring(0,length-2));}
     }
  
}
}
