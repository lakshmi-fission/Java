package practice;

public class SuperReducedString {
public static void main(String[] args){
	
       String str = "ggppppuurrjjooddwwyyllmmvvffddmmppxxaabbddddooppxxgghhhhvvnneeqqyyttbbffvvjjiiaammmmddddhhyywwqqiijj";
      for(int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                str = str.substring(0, i-1) + str.substring(i+1);
                i = 0;
            }
        }
        if (str.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println (str);
        }

}
/*private static String reducedString(String s){
    String result = s;
	for(int i=0; i<s.length();i++){
		if((i<s.length()-1) && (s.charAt(i)==s.charAt(i+1))){
			if(s.replace(s.substring(i, i+2),"").equals("")){
				result = "Empty String.";
			}
			else{
			result = reducedString(s.replace(s.substring(i, i+2),""));
			}
		}
	}
	return result;
}*/
}
