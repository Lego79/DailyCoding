package First;

public class Average {
    public static void main(String[] args) {
        int[] numbers = new int[]{90, 85, 75, 80, 100, 60, 85};
            double answer = 0;
            double result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result += numbers[i];
                answer = result / numbers.length;
            }

            System.out.println("answer = " + answer);

        }
    }



