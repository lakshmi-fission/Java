package practice;

import java.util.Scanner;

public class BinarySearchExample {
public static void main(String args[]){
	int targetValue,low = 0,high,middle;
	int[] elements = {2,4,6,8,10,12,14,16};
	high = elements.length-1;
	Scanner s =  new Scanner(System.in);
	targetValue = s.nextInt();
	while(low<=high){
		middle = (low + high)/2;
		if(targetValue == elements[middle]){
			System.out.println("position of "+targetValue +" is " + middle);
			break;
		}
		else if (targetValue<elements[middle]){
			high = middle - 1;
		}
		else{
			low = middle+1;
		}
	}
	if(low>high){
	System.out.println("element not found");
	}
}}
	
