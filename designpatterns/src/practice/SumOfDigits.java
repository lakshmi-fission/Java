package practice;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the digit for which you want sum:");
	int num = s.nextInt();
	System.out.println("Enter no of digits");
	int digits = s.nextInt();
	int i=1;
	while(!((int)(Math.log10(num-i)+1)<digits)){
		i++;
	}
	System.out.print(i);
	System.out.println(num-i);
	s.close();	
}
}
