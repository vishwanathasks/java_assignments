import java.util.Date;

public class demoThread

{
    
	public static void main(String args[])
    
	{
  
		Thread t=Thread.currentThread();
       
		 System.out.println("current thread : "+ t);
      
		 t.setName("myThread");
       
		 System.out.println("New thread : "+ t);
       
		System.out.println(new java.sql.Time(new Date().getTime()));
     
		System.out.println("After 10 Seconds");   
		try
       
		 {
           
			 Thread.sleep(10000);
           
			System.out.println(new java.sql.Time(new Date().getTime()));
      
		 }
       
		 catch(InterruptedException e)
        
		{
            
			System.out.println("Thread is Interrupted");
        
		}
    
	}

}