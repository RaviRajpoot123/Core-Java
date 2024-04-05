import java.util.Scanner;

/*To find Armstrong Number between two given number.*/
public class Asgnmnt_1_H {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int sum = 0, mod;
        // N= 153 = 1^3+5^3+3^3
        System.out.println("Enter a number to get Fibonacci Series : ");
        int number = mm.nextInt();
        int Num = number;
        while (number > 0){
            mod = number % 10;
            sum = sum + mod*mod*mod;
            number = number /10;
        }

        if (Num == sum){
        System.out.println("It's a Armstrong number !");
        }else {
            System.out.println("It's not a armstrong number");
        }
    }
}
