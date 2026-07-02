package Quene;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Queue<Integer> data=new PriorityQueue<Integer>();
       data.offer(78);
       data.offer(24);
       data.offer(37);
       data.offer(40);
       data.offer(25);
       data.offer(67);
       data.offer(45);
       data.offer(23);
       data.offer(60);
       
       
       System.out.println(data);
       
       System.out.println(data.poll());
       
       data.offer(15);
       
       System.out.println(data.poll());
       
       System.out.println(data.peek());
       
       data.offer(10);
       
       System.out.println(data.peek());
       
      
	}

}
