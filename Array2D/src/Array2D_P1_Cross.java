import java.util.Scanner;

public class Array2D_P1_Cross {
    public static void main(String[] args) {
        int [][] a = new int[3][3];
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter 9 number :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = mm.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            if ((i+j)%2==0){
                System.out.printf(String.valueOf(a[i][j])+" ");
            }else {
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
}
