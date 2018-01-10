package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class People {
	/*OutputStream outputSream = null;
    ObjectOutputStream objOps = null;
    
    for(Employee record : info){
    try {
   	 outputSream = new FileOutputStream(fileName);
        objOps = new ObjectOutputStream(outputSream);
        objOps.writeObject(record);
        objOps.flush();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally{
        try{
            if(objOps != null) objOps.close();
        } catch (Exception ex){
             
        }
    }}*/
/*public void displayObjects(){
        
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        try {
            fileIs = new FileInputStream(fileName);
            objIs = new ObjectInputStream(fileIs);
            Employee emp = (Employee) objIs.readObject();
            System.out.println(emp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(objIs != null) objIs.close();
            } catch (Exception ex){
                 
            }
        }
         
    }*/
}
