package Quene;

import java.util.LinkedList;
import java.util.Queue;

public class QueneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue <Integer> data=new LinkedList<Integer>();
		
         data.offer(10);
         data.offer(20);
         data.offer(30);
         data.offer(40);
         data.offer(50);
         
         
         System.out.println(data);//
       
         
         //peek()
         System.out.println(data.peek());//10
         
         
         data.offer(80);
         
         System.out.println(data);//
         System.out.println(data.peek());//10
         
         
         //pull
        data.poll();
         System.out.println("After pull " +data);//
         
         //isempty
         System.out.println(data.isEmpty());
         
         
         
         data.clear();
         
        // System.out.println(data.element());
         
         //Remove()
         System.out.println(data.remove());
         
         
	}

}
