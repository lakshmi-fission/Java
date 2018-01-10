package practice;


public class CaesarCipher {
public static void main(String[] args){
	String str = "159357lcfd";
	int rotation = 98;
	StringBuffer sb = new StringBuffer();
	/*char[] output = new char[str.length()];
	for(int i=0;i<str.length();i++){
		System.out.println(str.charAt(i));
		if(str.charAt(i)== 'z'){
			System.out.println(str.charAt(i)-25);
			output[i]= (char)(str.charAt(i)-25);
			System.out.println((char)(str.charAt(i)-25));
		}
		else if (str.charAt(i)=='Z'){
			output[i] = (char)(str.charAt(i)-15);
		}
		else if(Pattern.compile("[^A-Za-z]").matcher(Character.toString(str.charAt(i))).find()) {
			output[i]=str.charAt(i);
		}
		else{
			
			output[i]=(char)(str.charAt(i)+rotation);
			System.out.println(output[i]);
		}
	}
	for(int i=0;i<output.length;i++){
		System.out.print(output[i]);
	}*/
	
	for(int i = 0; i < str.length(); ++i) {
         sb.append(encryptChar(str.charAt(i), rotation));
     }
     
     System.out.println(sb.toString());
 }
 
 private static char encryptChar(char c, int k) {
     if(!Character.isAlphabetic(c)) return c;
     int base = Character.isLowerCase(c) ? 'a' : 'A';
     return (char)((c + k - base) % 26 + base);
 }

}
