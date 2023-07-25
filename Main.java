import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int [] numbers = new int[8];

            for (int i = 0; i < numbers.length; i++) {

                numbers[i] = (int)(Math.random()*50);
            }
            System.out.println(Arrays.toString(numbers));

            //____________________________________________________________
            for (int i = 0; i < numbers.length; i++) {
                if(i%2 == 1){
                    numbers[i] = 0;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }

