import java.util.Scanner;

public class nested_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter your grade.");
      int Grade=sc.nextInt();
      
      if(Grade>=35)
      {
    	  System.out.println("Passed");
    	  
    	  if(Grade>40)
    	  {
    		  System.out.println("Second class");
    		  
    		  if(Grade>60)
    		  {
    			  System.out.println("First class");
    			  
    			  if(Grade>60)
        		  {
    				  System.out.println("Distinction");
        		  }
    		  }
    	  }
      }
      else
    	  System.out.println("Fail");
		
	}

}