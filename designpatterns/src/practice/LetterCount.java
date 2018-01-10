package practice;

public class LetterCount {
public static void main(String[] args){
	String s = "saveChagesToFile";
	System.out.println(s.substring(0, 3)+s.substring(4));
	int count=1;
	for(int i=0;i<s.length();i++){
		String letter = Character.toString(s.charAt(i));
		if(letter == letter.toUpperCase()){
			count++;
		}
	}
	System.out.println(count);
}
}
