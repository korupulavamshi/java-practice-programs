package arrays;

public class CountElement {

	    public static void main(String[] args) {

	        int num[] = {1, 2, 2, 2, 3, 4, 4};

	        for (int i = 0; i < num.length; i++) {

	            int count = 0;

	            for (int j = 0; j < num.length; j++) {

	                if (num[i] == num[j]) {
	                    count++;
	                }
	            }

	            if (count > 1) {
	                System.out.println(num[i] + " occurs " + count + " times");
	            }
	        }
	        
	    }
}

/*output 
2 occurs 3 times 
4 occurs 2 times */
