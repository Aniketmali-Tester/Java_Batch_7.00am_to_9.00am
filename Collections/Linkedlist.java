package Collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> data=new LinkedList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(50);
		
		
		//Enhance loop
		for( Integer a:data)
		{
			
			System.out.println(a);
		}
		

	}

}
