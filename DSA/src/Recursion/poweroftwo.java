package Recursion;

public class poweroftwo {
	    public static boolean f(int n ){
	        if(n%2!=0){
	            return false;
	        }
	        if(n==2){
	            return true ;
	        }
	        else{
	            return f(n/2);
	        }
	    }

	    public boolean isPowerOfThree(int n) {
	        
	        if(n==1){
	            return true;
	        }
	        if(n<2 ){
	            return false;
	        }
	        
	        
	        return f(n);
	        
	        
	    }
	}
