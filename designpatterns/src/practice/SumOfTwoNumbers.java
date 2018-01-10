package practice;

import java.util.HashMap;

public class SumOfTwoNumbers {
	public static void main(String[] args){
	 int []a = {2,45,7,3,5,5,8,9};
	    printSumPairs(a,10); } 
	public static void printSumPairs(int[] a, int num){
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(hashMap.containsKey(a[i])){
			System.out.println(a[i] +", "+ hashMap.get(a[i]));		       
		} 
			else{  
			hashMap.put(num-a[i], a[i]);
		}
			
	}
	}
}
