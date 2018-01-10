package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {
	public static void main(String[] args) {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner sc = new Scanner (System.in);
	    int T = sc.nextInt();
	    for (int i = 0; i < T; i++) {
	        Set<Character> charSet1 = toCharSet(sc.next());
	        Set<Character> charSet2 = toCharSet(sc.next());

	        charSet1.retainAll(charSet2);

	        if (charSet1.size() > 0) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	    }
	}

	public static Set<Character> toCharSet(String word) {
	    Set<Character> charSet = new HashSet<Character>();

	    for (int i = 0; i < word.length(); i++) {
	        charSet.add(word.charAt(i));
	    }

	    return charSet;

	}
/*public static void main(String[] args){
	for(int k=0;k<4;k++){
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		result(s1,s2);
	   }
	}
public static void result(String s1, String s2){
	int c=0;
	for(int i=0;i<s1.length();i++ ){
		for(int j=0;j<s2.length();j++){
			if(s1.charAt(i)==s2.charAt(j)){
				c=c+1;
			}
			if(c==2){
				System.out.println("YES");
				return ;
			}
		}
			}
	if(c<2){
		System.out.println("NO");
	}
}*/
}
