package hackerearth;

import java.util.Scanner;

import javax.management.relation.RelationServiceNotRegisteredException;

public class PrintHackerearth {
	static int c=0;
	static char temp[] = new char[11];
	static int k=0;
	public static int subString(String input){
		String referenceString = "hackerearth";
		for(int i=0;i<input.length();i++){
			if(input.charAt(i) == referenceString.charAt(k)){
				temp[k]=input.charAt(i);
				k++;
				//removingChar;
				String removedString = input.substring(0,i)+input.substring(i+1);
				if(referenceString.equals(new String(temp))){
					c=c+1; 
					temp = new char[11];
					k=0;
					subString(removedString);
				}
			else{
				subString(removedString);
				}
			}
		}	
		return c;
	}
	public static void main(String args[]){
		System.out.println("Enter the String length:");		
		Scanner sc = new Scanner(System.in);		
		int length = sc.nextInt();
		System.out.println("Enter string:");
		String input = sc.nextLine();
		sc.close();		
		//String regex = "^[a-z]{" + length + "}";		
		try{
		if(input.matches("^[a-z]") && input.length() == length){
			System.out.println(subString(input));
		}}
		catch(Exception exception){
			System.out.println(exception.getMessage());
		}
		
		}
	}
	
	
