package arrays;

public class palindrome {
	    public static void main(String[] str){ 
	       String s = "MADAM";
	       String a = "";
	       for(int i = s.length()-1;i>=0;i--) {             
	           a = a + s.charAt(i);                
	       }
	       System.out.println("Reversed string:"+a);
	        if(s.equals(a)){                      
	            System.out.println("The given string is palindrome");
	         }
	        else{
	            System.out.println("The given string is not palindrome");
	       }
	       
	    } 
	}

/*output;
Reversed string:MADAM
The given string is palindrome
*/
