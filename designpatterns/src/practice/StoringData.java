package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class StoringData {
	
	public void storeData(String fileName,ArrayList<Employee> info){

	 
     File file = new File(fileName);
 			try{
 			    if(!file.exists()){
 			        System.out.println("new file created.");
 			        file.createNewFile();
 			    }

 			    FileWriter fileWriter = new FileWriter(file, true);
 			    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
 			    for(Employee record : info)
 			    {
 			    bufferedWriter.write(record.firstName +","+record.lastName+","+ record.age+","+ record.experience+","+record.organization + "\n");
 			    }
 			    bufferedWriter.close();
 			    System.out.println("Done");
 			} catch(IOException e) {
 			    System.out.println("COULD NOT LOG!!");
 			}
     
	}
	
}
