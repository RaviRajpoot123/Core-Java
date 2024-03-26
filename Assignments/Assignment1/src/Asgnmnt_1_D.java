import java.util.Scanner;

/*Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
*/
public class Asgnmnt_1_D {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter number 1");
        double num1 = mm.nextDouble();
        System.out.println("Enter number 2 ");
        double num2 = mm.nextDouble();
        System.out.println("What do you want to do these numbers , 1. + 2. -, 3. * , 4. /");
        int num = mm.nextInt();
        switch(num){
            case 1:{
                double result = num1 + num2;

                System.out.println("Result : " + result);
                break;
            }case 2:{
                double result = num1 - num2;

                System.out.println("Result : " + result);
                break;
            }case 3:{
                double result = num1 * num2;

                System.out.println("Result : " + result);
                break;
            }case 4:{
                double result = num1 / num2;

                System.out.println("Result : " + result);
                break;
            }
            default:{
                System.out.println("Incorrect");
            }
        }
    }

}
