import java.util.Scanner;

public class _4_26_SumOfNeg_EvenPos_OddPos_0Ter {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int sum1 = 0, sum2 = 0, sum3 = 0, num;
        System.out.println("Enter number to get a sum of");
        num = mm.nextInt();

        while (num != 0) {
            if (num < 0) {
                sum1 = sum1 + num;
            } else if (num > 0 && num % 2 == 0) {
                sum2 = sum2 + num;
            } else if (num > 0 && num % 2 != 0) {
                sum3 = sum3 + num;
            } else if (num == 0) {
                break;
            }
            num = mm.nextInt();
        }
        System.out.println("Sum Of Negative Number : " + sum1);
        System.out.println("Sum Of Positive Even Number : " + sum2);
        System.out.println("Sum Of Positive Odd Number : "+sum3);
    }
}