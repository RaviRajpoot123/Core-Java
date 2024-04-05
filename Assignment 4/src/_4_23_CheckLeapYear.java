import java.util.Scanner;

public class _4_23_CheckLeapYear {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int year;
        System.out.println("Enter the year to check leap year ");
        year = mm.nextInt();
        if (year%4 == 0){
            System.out.println("It's a leap year!");
        }else
        {
            System.out.println("It's not a leap year");
        }
    }
}
