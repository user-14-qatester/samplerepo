package exceptionhandling;

public class ExceptionExample 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int a=10,b=0;
    
     try
     {
     int c=a/b;
     System.out.println(c);
     }
     
     catch(ArithmeticException e)
     {
      b=2;
      int c=a/b;
      System.out.println(c);
      System.out.println(e);
     }
     
    /* finally  //the execution of code inside finally is mandatory regardless of the occurrence of any exception
     {
    	 b=2;
         int c=a/b;  
         System.out.println(c);
     }*/
       
	}

}
