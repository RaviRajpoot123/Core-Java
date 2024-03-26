import java.util.Scanner;

/*Take 2 numbers as input and print the largest number.
 */
public class Asgnmnt_1_E {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter number 1");
        double num1 = mm.nextDouble();
        System.out.println("Enter number 2 ");
        double num2 = mm.nextDouble();
        if (num1 > num2){
            System.out.println("Number 1 is greatest !");
        } else if (num1 == num2) {
            System.out.println("Both are equal");
        }else {
            System.out.println("Number 2 is greatest !");
        }
    }
}
