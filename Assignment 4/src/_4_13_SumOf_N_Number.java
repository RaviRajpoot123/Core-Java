import java.util.Scanner;

public class _4_13_SumOf_N_Number {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double sum = 0;
        int count = 1;
        System.out.println("how many number to be entered ");
        int numToEnter = mm.nextInt();
        int newNumEnter = numToEnter;
        while (numToEnter > 0) {
            System.out.println("Enter number : " +count);
            int num = mm.nextInt();
            sum = sum + num;
            count++;
            numToEnter--;
        }
        System.out.println("********************************************************SumOf_N_Number********************************************************");
        System.out.println(sum);
    }
}
