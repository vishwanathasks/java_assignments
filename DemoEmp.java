import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//creating Employee class
class employee
{
	 int EmpId;
	 String EmpName;
	 String EmpAdd;
	 float EmpSal;
	employee(int id, String name, String add, float sal)
	{
		EmpId= id;
		EmpName= name;
		EmpAdd= add;
		EmpSal= sal;
	}
}

public class DemoEmp
{
	public static void main(String args[])
	{
	    int count=0;
		ArrayList<employee> emp= new ArrayList<employee>();
		//add employee object
		emp.add(new employee(953007,"Vish","Bangalore",22000));
		emp.add(new employee(780383,"Kavya","Mysore",25000));
		emp.add(new employee(953010,"Prashant", "Chennai",21000));
		emp.add(new employee(918245,"Sahana", "Hyderabad",22500));
		emp.add(new employee(952110,"Sachin", "Pune",21500));
		emp.add(new employee(953008,"Anu", "Coimbatore",23000));

		System.out.println("Enter the Employee id  to search: ");
		Scanner in = new Scanner(System.in);
		int ID= in.nextInt();
		String Name=in.nextLine();
		
		//iterating and traversing
        		Iterator<employee> iterator = emp.iterator();
		employee empo;
		
    
        		while (iterator.hasNext())
        		{
			empo= (employee) iterator.next();
        			if(ID==empo.EmpId)
        			{
        				System.out.println("EMP ID: "+ empo.EmpId);
        		    		System.out.println("EMP NAME: "+ empo.EmpName);
        		   		 System.out.println("EMP ADDRESS: "+ empo.EmpAdd);
        		    		System.out.println("EMP SALARY: "+ empo.EmpSal);
        				count++;
        				break;
        			
        			}
        		}
        		if (count==0)
        		{
        	   		   System.out.println("Record not found");
        		}	
        	
      	  }
}