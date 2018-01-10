package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {
	public static void main(String args[]){
		String example1 = "sam@gmail.in hi this dacc is  www.goo4456gle.in dfbkbtrs/find WWW.GOOGLE.COM cmedfgkrtdfv,df,r http://www.androidhive.info the weblink in it fdmgokhthefs,qurutito https://www.google.co.in zxbvisadsafuh https://www.simplifiedcoding.net vnsdjfbfegtuyfkwo quickblox.com werrrrfrvr aws@gmail.com";
		 String reg = "((?=(((http|https|ftp|ws|wss|file):\\/\\/)|www.|ftp.))"
					+ "("
					+ "((http|https|ftp|ws|wss|file):\\/\\/)?(www.|ftp.|WWW.)?"
					+ "([a-zA-Z0-9:@%-~#=\\+]+)(\\.[a-z]{2,6})?"
					+ "((\\.[a-zA-Z]{2,4})|(\\.[a-zA-Z]{2,4}:[0-9]{1,5}))"
					+ "(([/])([a-zA-Z@0-9%_/\\+-~#=]*))?"
					+ "([ ]|$)"
					+ ")"
					+ "|"
					+ "("
					+ "((?<=( ))[a-zA-Z0-9:%_-~\\+#=]+|((^)[a-zA-Z0-9:%_-~\\+#=]+))"
					+ "(\\.[a-z]{2,6})?"
					+ "((\\.[a-zA-Z]{2,4})|(\\.[a-zA-Z]{2,4}:[0-9]{1,5}))"
					+ "(([/])([a-zA-Z0-9@%_/\\+-~#=]*))?"
					+ "([ ]|$)"
					+ ")"
					+ ")";
		String example2 =  "gmail.com   ggggmail.com  gggg@mail.com  www.gmail.cof.in   a   http://https://gmail.comb/   a ftp://foo:@host.com   reporting.dpclk.com:8888/impala/#fff jtrhjitj gollllllllle.com" ;
		Pattern p = Pattern.compile(reg);
		Matcher m =p.matcher(example1);
		while(m.find()){
			System.out.println(m.group());
			
		}
		Pattern p1 = Pattern.compile(reg);
		Matcher m1 = p1.matcher(example2);
		while(m1.find()){
			System.out.println(m1.group());
		}
		
	}

}
