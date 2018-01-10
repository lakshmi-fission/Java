package practice;

import java.util.Scanner;

public class FunnyString {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int in   = s.nextInt();
	for(int i=0;i<in;i++){
		String str = s.next();
		boolean flag = false;
		for(int j=1;j<str.length();j++){
			if(Math.abs(str.charAt(j)-str.charAt(j-1))==Math.abs(str.charAt(str.length()-j)-str.charAt(str.length()-(j+1)))){
				flag = true;
				
			}
			else{
				flag = false;
				break;
			}
		}
		if(flag){
			 System.out.println("Funny");
		 }else{
			 System.out.println("Not Funny");
		 }
	}
	s.close();
}
}