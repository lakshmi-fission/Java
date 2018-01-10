package practice;



//We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. 
//In other words, both strings must contain the same exact letters in the same exact frequency 
public class MakingAnagram {
public static void main(String[] args){
		String str1 = "fsqoiaidfaukvngpsugszsnseskicpejjvytviya";
		String str2 = "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget";
		if(str1.length()>str2.length()){
			System.out.println(anagram(str1,str2));
		}
		else{
			System.out.println(anagram(str2,str1));
		}
}
static int anagram(String s1, String s2){
	int c=0,total=0;
	int temp = s2.length();
	for(int i=0;i<s1.length();i++){
		if(s2.contains(Character.toString(s1.charAt(i)))){
			int index = s2.indexOf(s1.charAt(i));
			s2 = s2.substring(0, index)+s2.substring(index+1);
			c=c+1;
		}
	}
	total = (s1.length()-c)+(Math.abs(temp-c));
	 return total;
}
}
