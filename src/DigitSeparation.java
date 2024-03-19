import java.util.Scanner;

public class DigitSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non negative five digits number : ");
        int number = sc.nextInt();

        if (number<0 || number>99999){
            System.out.println("Invalid input. Please enter a non-negative integer with at most five digits.");
        }else {
            int[] digits = new int[5];

            for (int i = 0; i < 5; ++i) {
                digits[i] = number % 10;
                number = number / 10;
            }
            for (int i = 5 - 1; i >= 0; i--) {
                System.out.print(digits[i] + " ");
            }
        }
    }
}
