import java.util.Scanner;

public class _4_14_ArmstrongNumber {
    public static void main(String[] xyz) {
        int n, sum = 0, rem, temp;
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter to know Product Of Digit : ");
        n = mm.nextInt();
        temp = n;
        for (; n > 0; n = n / 10) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);

        }
        System.out.println("The POD of Entered number is : " + sum);
        if (temp == sum) {
            System.out.println("It is armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
