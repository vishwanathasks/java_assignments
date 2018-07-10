class myException extends Exception
    
{

        public void  myException()

        {
        
		System.out.println("My exception is thrown");
       
	}
        
        
	public String toString()
      
	  {
        
		return "Myexception Object: Age cannot be < 18 and cannot be >60";
       
	 }
   
 }
    



public class age

{
   
 static int f=0;
    
public static void main(String []args)
    
{
         
        
 try
        
 {
            
 int age=Integer.parseInt(args[0]);
           
  if( age <18|| age >60)
                
throw new myException();
       
  }
         
         
catch(myException e)
         
{
             f=1;
            
 System.out.println("Exception:" +e);
             
        
 }
         
         
if(f==0)
           
 System.out.println("You have entered correct credential ");
         
  
  }

}