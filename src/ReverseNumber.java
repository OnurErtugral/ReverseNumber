import java.util.ArrayList;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234598));
    }
    
    public static int reverse(int number) {
        int sum = 0;
        String temp = Integer.toString(number);
        int digit = temp.length();

        for (int i = digit; i > 0; i--) {
            int remain = number % 10;
            sum += remain * Math.pow(10, i - 1);
            number /= 10;
            if (number >= 10) {
                continue;
            } else {
                sum += number;
                break;
            }
        }
        return sum;
    }
}
