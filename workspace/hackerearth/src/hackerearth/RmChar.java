package hackerearth;

public class RmChar {
		public static void main(String args[]){
			String l ="lakshmi";
			char[]  t = {0,0,0,0,0,0,0} ;
			int c=0;
			for(int i=0; i<l.length();i++){
				if(l.charAt(i)=='s'){
					t[i]=l.charAt(i+1);
					c=c+2;
				}
				else{
				if(i==l.length()-1){
						break;
					}
				t[i]=l.charAt(c);
				c++;
				
				}
			}
			for(int j=0;j<t.length;j++){
				System.out.print(t[j]);
			}
		}
		
}
