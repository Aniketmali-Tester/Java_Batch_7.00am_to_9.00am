package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("program Started");
		
		int data [] =new int[5];
		
		try {
		System.out.println("try block startrd");
		    data[0]=10;
		    data[1]=20;
		    data[2]=30;
		    data[3]=40;
		    data[4]=50;
		    data[5]=60;
		    
		    System.out.println(data[0]+"/t"+data[2]);
		    System.out.println("block Ended");
		
		}catch (NullPointerException e) {
			System.out.println(e);
		
		}  finally {
			System.out.println("Closing costly Resources");
		} 
		
		System.out.println("program Ended");

	}

}
