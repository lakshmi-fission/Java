package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GemStones {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int total=0;
	    int[] array = new int[26];
	    Set<Character> input = new HashSet<>();
	    for(int i=0;i<n;i++){
	    	for(Character c : scan.next().toCharArray()) input.add(c);
	    		input.forEach(c -> array[c-'a'] ++);
	    		input.clear();
	    	}
	    for(int j:array){
	    	if(j==n){
	    		total=total+1;
	    	}
	    }
	    System.out.println(total);
	   /* Set<Character> set = new HashSet<>();
	    int[] count = new int[26];
	    for(int i = 0; i < n; i ++) {
	        for(Character c : scan.next().toCharArray()) set.add(c);
	        set.forEach(c -> count[c - 'a'] ++);
	        set.clear();
	    }
	    int total = 0;
	    for(int i : count) {
	        if(i == n) total ++;
	    }
	    System.out.println(total);*/
	}
}
