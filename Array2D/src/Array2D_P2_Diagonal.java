import java.util.Scanner;

public class Array2D_P2_Diagonal {
    public static void main(String[] args) {
        int [][] a = new int[3][3];
        System.out.println("Enter 9 Number :");
        Scanner mm = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = mm.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                    System.out.printf(String.valueOf(a[i][j])+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
