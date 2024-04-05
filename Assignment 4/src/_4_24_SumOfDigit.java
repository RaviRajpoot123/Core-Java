import java.util.Scanner;

public class _4_24_SumOfDigit {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int num,sumOfDigit = 0;
        System.out.println("Enter a number to get Sum Of Digit");
        num = mm.nextInt();
        while (num > 0){
            sumOfDigit = sumOfDigit + num % 10;
            num = num /10;
        }
        System.out.println("**************************************************************************SumOfDigit**************************************************************************");
        System.out.println(sumOfDigit);
    }
}
