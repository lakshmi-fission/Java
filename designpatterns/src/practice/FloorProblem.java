package practice;

import java.util.Scanner;

public class FloorProblem {
	
	public static boolean isPrime(int number){
		int count=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				count=count+1;
			}
		}
		if(count==2){
			return true;
		}
		else{
			return false;
		}
		
	}
public static void main(String args[]){
	System.out.println("Enter no of floors:");
	Scanner s=  new Scanner(System.in);
	int noOfFloors = s.nextInt();
	System.out.println("Enter no of events:");
	int noOfEvents = s.nextInt();
	System.out.println("Enter event values:");
	int sum=0,noOfPle = 0;
	for(int i=0; i<3;i++){
		String[] input = s.nextLine().split(" ");
		System.out.println(input[0]);
		System.out.println(input[1]);
		System.out.println(input[2]);
	}
	/*for(int i=0;i<noOfEvents;i++){
		//int x = Integer.parseInt(input[1])+Integer.parseInt(input[2]);
		String[] input = s.nextLine().split(" ");
		System.out.println(input[0]);
		System.out.println(input[1]);
		System.out.println(input[2]);
		if(input[0].equals("1")){
			
			if(isPrime(x)){
				sum = sum+Integer.parseInt(input[1])-2;
				noOfPle = noOfPle+Integer.parseInt(input[2]);
			}
		}
		else{
			if(!(x%2==0)){
				sum = sum+Integer.parseInt(input[1])-1;
				noOfPle = Math.abs(noOfPle-Integer.parseInt(input[2]));
			}
		}
	}*/
	System.out.println("totalDisstance=="+sum);
	System.out.println("noOfPleople==="+noOfPle);
}

}
