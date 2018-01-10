package practice;



public class Anagram {
	public static void main(String[] args){
		//String s = "hhpddlnnsjfoyxpciioigvjqzfbpllssuj";
		String s = "iiqopiiq";
		//System.out.println(anagram(s));
	  if(s.length()%2 != 0){
			System.out.println("-1");
		}
		else{
			int middle = s.length()/2;
			String right = s.substring(middle);
			String left = s.substring(0, middle);
			int c=0;
			for(int i=0;i<left.length();i++){
				if(!(right.contains(Character.toString(left.charAt(i))))){
					c=c+1;
				}
			}
			System.out.println(c);
		}
	}
	/*static int anagram(String s){
    	int[] a = new int[26];int[] b = new int[26];
    	if(s.length()%2 != 0)
    		return -1;
    	for(int i=0, j =s.length()/2; i< s.length()/2; i++, j++){
    		a[s.charAt(i)-'a']++;
    		b[s.charAt(j)-'a']++;
    	}
    	int diff =0;
    	for(int i=0; i< 26; i++)
    		if(b[i]-a[i] > 0){
    		    			diff += (b[i]-a[i]);
    	}
    	return diff;
    }
	*/
	}
