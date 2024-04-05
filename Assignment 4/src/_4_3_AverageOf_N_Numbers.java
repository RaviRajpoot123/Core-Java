import java.util.Scanner;

public class _4_3_AverageOf_N_Numbers {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double sum = 0;
        int count = 1;
        System.out.println("how many number to be entered ");
        int numToEnter = mm.nextInt();
        int newNumEnter = numToEnter;
        while (numToEnter > 0) {
            System.out.println("Enter next : " + count);
            int num = mm.nextInt();
            sum = sum + num;
            numToEnter--;
            count++;
        }
        System.out.println("********************************************************AverageOf_N_Number********************************************************");
        System.out.println(sum / newNumEnter);
    }
}
