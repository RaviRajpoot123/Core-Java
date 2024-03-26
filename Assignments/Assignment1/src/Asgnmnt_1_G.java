import java.util.Scanner;

/*To calculate Fibonacci Series up to n numbers.*/
public class Asgnmnt_1_G {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter a number to get Fibonacci Series : ");
        double Number = mm.nextDouble();
        double Sum = 0;

        while (Number>=0){
            Sum = Sum + Number;
            Number--;
        }
        System.out.println("Fibonacci Sum " + Sum);

    }
}
