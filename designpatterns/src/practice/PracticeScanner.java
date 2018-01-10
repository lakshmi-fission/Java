package practice;

import java.util.Scanner;

public class PracticeScanner {
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	for(int i=0; i<3;i++){
		String[] input = s.nextLine().split(" ");
		System.out.println(input[0]);
		System.out.println(input[1]);
		System.out.println(input[2]);
	}
}
}
