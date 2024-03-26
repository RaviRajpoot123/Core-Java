import java.util.Scanner;
public class ArrUD {
    public static void main(String[] args) {
        int [] a = new int[5];
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter 5 number:");
        for (int i = 0; i < 5; i++) {
            a[i] = mm.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf(a[i]+" ");
        }
    }
}
