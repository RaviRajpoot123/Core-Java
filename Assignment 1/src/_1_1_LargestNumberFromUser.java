import java.util.Scanner;

//. Write a program to print whether a number is even or odd, also take
//input from the user.
public class _1_1_LargestNumberFromUser
{
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter a number to check odd even");
        int n = mm.nextInt();
        if (n % 2 == 0) {
            System.out.println("Entered number is even ! ");
        }else{
            System.out.println("Entered number id odd !");
        }
    }
}
