package arrays;
public class AscendingOrder {
	
    public static void main(String[] args) {

        int num[]= {50, 20, 40, 10, 30};

        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                if (num[i] > num[j]) {

                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("Ascending order:");

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

/*output 
Ascending order: 10 20 30 40 50
*/
