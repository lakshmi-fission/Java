package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class FissionProblem {
	public static void main(String args[]) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] splitedData;
		ArrayList<Employee> info = new ArrayList<>();
		
		while ((line = stdin.readLine()) != null && line.length()!= 0) {
			 if(line.equalsIgnoreCase("SORT")){
				 System.out.println("sort");
				 Work1 work1 = new Work1(info);
				 Thread thread1 = new Thread(work1);
				 thread1.start();
				 Work2 work2 = new Work2(info);
				 Thread thread2 = new Thread(work2);
				 thread2.start();
				 Work3 work3 = new Work3(info);
				 Thread thread3 = new Thread(work3);
				 thread3.start();				 
			 }
			 else if (line.equalsIgnoreCase("EXIT")){
				 System.out.println("exit");
			 }
			 else{
				 splitedData = line.split(",");
				 info.add(new Employee(splitedData[0],splitedData[1],Integer.valueOf(splitedData[2]),Integer.valueOf(splitedData[3]),splitedData[4]));
			 }
		 
		}
	}

}
