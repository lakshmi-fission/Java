package hackerearth;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		//String s = "We promptly judged antique ivory buckles for the prize";
		String smallLetters = s.toLowerCase();
		String withoutSpaces  = smallLetters.replaceAll(" ","");
		System.out.println(withoutSpaces);
		Set<Character> set = new HashSet<>();
		for(int i=0;i<withoutSpaces.length();i++){
			set.add(withoutSpaces.charAt(i));
		}
		Iterator<Character> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		if(set.size()==26){
			System.out.println("panagram");
		}
		else{
			System.out.println("not panagram");
		}
		}

}
