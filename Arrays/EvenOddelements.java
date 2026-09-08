package arrays;

public class EvenOddelements {
	
	    public static void main(String[] args) {

	        int num[] = {9,30,20,69,33,64};

	        String even = "";
	        String odd = "";

	        for (int i = 0; i < num.length; i++) {

	            if (num[i] % 2 == 0) {
	                even = even + num[i] + " "; 
	            } else {
	                odd = odd + num[i] + " ";
	           }
	        }

	        System.out.println("Even numbers are:"+even);
	        System.out.println("Odd numbers are:"+odd);
	   } 
} 

/*output:  
Even numbers are:30 20 64 
Odd numbers are:9 69 33 */

