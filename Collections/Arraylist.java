package Collections;

import java.util.ArrayList;
import java.util.List;

import Controlstatement.Empolyeesal;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*//Create Arraylist
		ArrayList data=new ArrayList();
	    data.add("Java");
	    data.add(10);
	    data.add(20.5);
	    data.add('A');
	    
	    
	    System.out.println(data);
	    
	    
	    //Same type of Data store
	    List <String> name=new ArrayList<String>();
	    name.add("Raju");
	    name.add("null");
	    
	    System.out.println(name);*/
	    
	    
	    
	    
	    //Methods
	    
	    ArrayList<String> Employee=new ArrayList<String>();
	    Employee.add("Sathish");
	    Employee.add("Rahul");
	    Employee.add("Kiran");
	    Employee.add("Amit");
	    
	   System.out.println(Employee);
	   
	   
	   //addall()
	   Employee.add(1, "Rohit");
	   System.out.println(Employee);
	   
	   
	   //remove
	   Employee.remove(1);
	   System.out.println("After Remover Index 1 : "+Employee);
	   
	   
	   //remove(Object)
	   Employee.remove("Kiran");
	   System.out.println("After Remove Object : "+Employee);
	   
	   
	   //Set(int index,object)
	   Employee.set(2, "Kumar");
	   System.out.println("After Modify 2 index value: "+Employee);
	   
	   
	   //get Index
	   System.out.println(Employee.get(1));
	   
	   
	   //Size
	   System.out.println("List Size : "+Employee.size());
	   
	   
	    //isEmpty
	   System.out.println("Is Empty : "+Employee.isEmpty());
	    
	    
	   
	   //addall
	   ArrayList<String> newEmployee=new ArrayList<String>();
	   newEmployee.add("Mani");
	   newEmployee.add("John");
	   
	   Employee.addAll(newEmployee);
	   System.out.println("After Addall : "+Employee);
	   
	   
	   //Contains
	   System.out.println("Contains  : "+Employee.contains("Mani"));
	   System.out.println("Contains all : "+Employee.containsAll(newEmployee));
	   
	   //removeall
	   
	       Employee.removeAll(newEmployee);
	       
	       System.out.println("After Remove all : "+Employee);
	       
	       
	       //toarray()
	       Object[] arr = Employee.toArray();
	       System.out.println("Array value : "+arr);
	         
	       
	       //for Enhanced Loop
	       
	       for(Object a:arr)
	       {
	    	   
	    	   System.out.println(a);
	       }
	       
	       //clear()
	       Employee.clear();
	       System.out.println("After clear : "+Employee);
	       
	       System.out.println(Employee.isEmpty());
	    
	    
	    
	    
	    

	}

}
