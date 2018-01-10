package oopsconcepts;


import java.util.HashSet;

import java.util.Scanner;

public class UniformString {
public static void main(String args[]){
	String s = "abccddde";
	int n = 6;
	Scanner scan = new Scanner(System.in);
	HashSet<Integer> hashSet = new HashSet<>();
	int multiple = 1;
	int lastValue=0;
	for(int i=0;i<s.length();i++){
			int value = s.charAt(i)-'a'+1;
			if(value==lastValue){
				multiple++;
			}
			else{
				multiple = 1;
				lastValue = value;
			}
			int num = lastValue*multiple;
			hashSet.add(num);
	}
	for(int j=0;j<n;j++){
			if(hashSet.contains(scan.nextInt())){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	scan.close();
	}
}

