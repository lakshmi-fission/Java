package oopsconcepts;

public class DistinctChars {
	public static void main(String[] args){
	/*	String str = "aaabbb";
		char[] array = new char[str.length()];
		for(int i=0;i<str.length();i++){
			if()
		}
		if(array.length == 0 ){
			System.out.println("No distinct characters");
		}
		else{
			for(char item :array){
				System.out.print(item);
			}
		}*/
		int diff = 0,t;
	   
	    String str = "aaabbb";
	    int len = str.length();
	    for(int k = 0; k < 3;k++)
	    {    
	    if(len%2!=0)
	        System.out.println("-1");
	    else
	    {
	        String str1 = str.substring(0,(len/2));
	        String str2 = str.substring(len/2);        
	        for(int i=0;i<str1.length();i++)
	        {

	                if(!str2.contains(str1.charAt(i)+""))
	                    diff++;                       

	        }
	                   System.out.println(diff);
	    }
	   }
	}

}
