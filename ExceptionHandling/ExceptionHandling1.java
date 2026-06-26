package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("program Started");
		
		
		 String s=null;
		
		 
		 try {
			 System.out.println(s.length());
		 }catch (Exception e) {
			 
			 System.out.println(e);
			
		}
		 
		 
		 System.out.println("program Ended");

	}

}
