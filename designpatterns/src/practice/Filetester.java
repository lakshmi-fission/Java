package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filetester extends Thread{

	private int i;
	public Filetester(int i) {
		this.i= i;
	}
	public static void main(String[] args) {

		Filetester tester = new Filetester(10);
		tester.start();
		tester.setName("Thread 1");
		
		
		Filetester tester1 = new Filetester(100);
		tester1.setName("Thread 2");
		tester1.start();


	}
	@Override
	public void run() {
		File file = new File("C:\\Users\\Dell\\Desktop\\filetest.txt");
		FileWriter fileWriter;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			for(int k = 0; k<i;k++){
				Thread.sleep(1000);
				bufferedWriter.write(k +" --- " + Thread.currentThread().getName());
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null){
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
