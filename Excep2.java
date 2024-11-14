package exception;

public class Excep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try {
//	System.out.println("1");
//	int a =5/0;
//}
//  catch(ArithmeticException e)
//{
//	  System.out.println("2");
//	  System.exit(0);
//}
//  finally 
//  {
//	  System.out.println("3");
//  }
//System.out.println("4");
//	}

		
           
           try
           {
          System.out.println("1");
            int data = 15 / 0;
           
            }
         catch(ArithmeticException e)
           {
        	//System.out.println( e.getMessage());
         Throwable obj = new Throwable("Sample");
          try
           {
          throw obj;
            } 
          catch (Throwable e1) 
             {
        	 
          System.out.println("8");
             }
             }
        finally
         {
        System.out.println("3");
         }
      System.out.println("4");
         }
          }
 

