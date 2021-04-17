package week1.day1;

public class Inter {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6};
	    int B[] = {4,5,6,7,8,9};
	    System.out.println("Intersection of the 2 arrays:");
	      
	     
	      for(int i = 0; i<A.length; i++ ) 
	      {
	         for(int j = 0; j<B.length; j++) 
	         {
	            if(A[i]==B[j]) 
	            {
	               System.out.println(B[j]);
	          
	            }
	            
	         }
	      }
	   }

	}


