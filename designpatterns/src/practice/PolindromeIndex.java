package practice;

public class PolindromeIndex {
public static void main(String[] args){
	String s = "aaa";
	System.out.println(isIndex(s)); 
}
public static int isIndex(String s){
	for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
	      if(s.charAt(i) != s.charAt(j)) {
	           if(s.charAt(i+1) != s.charAt(j))
	                    return j ;
	                else if(s.charAt(i) != s.charAt(j-1)) 
	                    return i;
	                else {
	                    if(s.charAt(i+2) != s.charAt(j-1))
	                        return j;
	                    if(s.charAt(i+1) != s.charAt(j-2))
	                        return i;
	                }
	            }
	        }
	        return -1;
}

}
