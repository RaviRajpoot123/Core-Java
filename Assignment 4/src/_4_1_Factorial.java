import java.util.Arrays;
import java.util.Scanner;

public class _4_1_Factorial {
    public static void main(String[] args) {

        Scanner mm = new Scanner(System.in);
        System.out.println("Enter a number to get Factorial ");
        long num = mm.nextInt();
        long fact = 1;
        while (num>=0){
            if (num == 0 || num == 1) {

                System.out.println("**********************************************************Output**********************************************************");
                System.out.println("The factorial is : " + fact);
                break;
            }else{
                while(num>1){
                    fact = fact * num;
                    num--;
                }
                System.out.println("**********************************************************Output**********************************************************");
                System.out.println("The factorial is : " + fact);
                break;
            }
        }

    }
}