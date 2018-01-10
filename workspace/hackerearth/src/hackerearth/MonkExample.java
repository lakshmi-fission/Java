package hackerearth;

import java.util.ArrayList;
import java.util.Scanner;

public class MonkExample {
	 public static void main(String args[]){
		    int nooftestcases;
		    ArrayList<String> arrayList = new ArrayList<String>();
		    ArrayList<Integer> values = new ArrayList<>();
		     Scanner scanner  = new Scanner(System.in);
		     nooftestcases = Integer.parseInt(scanner.nextLine());
		     System.out.println(nooftestcases);
		     for(int i=0;i<nooftestcases;i++){
		     arrayList.add(i,scanner.nextLine()); 
		     }
		     for(String item:arrayList){
		    	 int count = 0;
		    	 String lowerCase  = item.toLowerCase();
		    	 for(int j=0;j<lowerCase.length();j++){
		             if(lowerCase.charAt(j) == 'i' || lowerCase.charAt(j) =='a'||lowerCase.charAt(j) =='e'|| lowerCase.charAt(j) =='o'||lowerCase.charAt(j) =='u'){
		            	 	count = count+1;
		             }
		         }
		    	 values.add(count);
		     }
		    for(Integer intValues:values){
		    	System.out.println(intValues);
		    }
}
}