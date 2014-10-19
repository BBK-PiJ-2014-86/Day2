package day2;


import java.util.Scanner;

public class OptimusPrime {

	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        boolean notPrime = false;
        boolean primeFound1 = false;
        boolean notPrime1 = false;
        boolean primeFound2 = false;
        boolean notPrime2 = false;
        
        int nextPrime = 0;
        int previousPrime=0;
        
        
        
        int userNr = sc.nextInt(); // taking user's input
        
        
        // checking if user's number is prime. If so notPrime will remain false and will not turn into true
        for (int i =2; i<userNr; i++){
        	
        	
        		if (userNr % i == 0) {
        		
        		notPrime=true;
        		}
        	}
        
        
    	   
        if (!notPrime) {
        	System.out.println("The entered number is prime"); // if user's number is already prime, there is no need to go on
        
        } else {
        	
        	// the following for-loop checks each next number and if it is prime and assigns to nextPrime.
        	for (int j = userNr+1; !primeFound1; j++){

        	  notPrime1=false;
        	  
              for (int m = 2; m<j; m++) {
            	  if (j % m == 0) {
            		  notPrime1 = true;
            	  } 
              }
             
        	if (!notPrime1) {
        		primeFound1 = true;
        		nextPrime = j; // assign the next prime number
        	} 
        	
        }
        	
        	// the following for-loop checks each previous number until it reaches prime. Assigns to previousPrime
        	
        for (int k = userNr-1; !primeFound2; k-- ){
        	
        	notPrime2 = false;
        	for (int h = 2; h<k; h++ ) {
        		if (k%h == 0) {
        			notPrime2 = true;
        		}
        	}
        	
        	if (!notPrime2) {
        		primeFound2 = true;
        		previousPrime=k;
        	}
        }
       
        //checking which one is closer
        
        if ((nextPrime-userNr) == (userNr - previousPrime)){
        	System.out.println(previousPrime+ ", "+nextPrime);
        	} else if ((nextPrime-userNr) >(userNr - previousPrime)) {
        	System.out.println(nextPrime);
        	} else {
        	System.out.println(previousPrime);
        	}
        
        }//end of first If
       

        
     }//end of main
        
 } //end of class
