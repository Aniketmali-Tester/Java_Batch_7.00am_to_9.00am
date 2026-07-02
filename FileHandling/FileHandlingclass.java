package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Create a file
	/*	File Myfile=new File("Employee.txt");
		try {
			Myfile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Write Data Into a file
		try {
			FileWriter writer=new FileWriter("Employee.txt");
			writer.write("Employee name : Rahul");
			writer.write("Employee name : Kishore");
			writer.write("Employee name : Rohit");
			writer.write("Employee name : Rohan");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		//Read Data Fom a file
		   File Readfile=new File("Employee.txt");
		   Scanner Scan = null;
		try {
			Scan = new Scanner(Readfile);
			
			  while(Scan.hasNextLine())
				   
				   
			   {
				   System.out.println(Scan.nextLine());
				   	   
			   }
			   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		Scan.close();
		   
		   
		 
		
		
		
		

	}

}
