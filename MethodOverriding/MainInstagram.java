package MethodOverriding;

public class MainInstagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instagram I=new Instagram();
		InstagramV2 v=new InstagramV2();
		
		//Basic version
		/*obj =new Instagram();
		obj.Features();
		obj.Basic();
		System.out.println("=========================================");*/
		
		//Version v2 updated features
		//obj=new InstagramV2();
		v.Features();
		I.Features();
		v.Basic();
		System.out.println("=========================================");
		
		//Version V3 updated Features
		/*obj=new InstagramV3();
		obj.Features();
		obj.Basic();
		System.out.println("=========================================");*/
		
		//Version V4 Updated Features
		/*obj=new InstagramV4();
		obj.Features();
		System.out.println("=========================================");*/

	}

}
