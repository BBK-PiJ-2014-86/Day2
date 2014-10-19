/*
 Modify the program that you wrote for the former exercise so that it writes on screen the first 1,000 primes. 
 
 */


package day2;

public class ThousandPrimes {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean notPrime= false;
		int m = 1;
       
        int i = 1;	 
		while (m<=1000) {
			 i++;
        	 for (int j = 2; j <i;j++){
        		 if(i%j == 0) {
        			 notPrime = true;
        		 } 
        		 
        	 }
        	
        	 if(notPrime==false) {
    		
    				   System.out.println(i);
    				   m++;
    			 }
        		 
        	 
        	 notPrime = false;
         
         }
	}
}
