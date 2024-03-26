import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args)
    {
          /*Implement a program to display the sum of two given numbers
            if the numbers are same. If the numbers are not same,
            display the double of the sum.
            */
            Scanner mm = new Scanner(System.in);
            int num1,num2,sum;
            System.out.println("Enter num1:");
            num1 = mm.nextInt();
            System.out.println("Enter num2:");
            num2 = mm.nextInt();
            if(num1==num2)
            {
                sum = num1+num2;
            }
            else
            {
                sum = (num1+num2)*2;
            }
            System.out.println(sum);
    }
}