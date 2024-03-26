import java.util.Scanner;

public class Array2D_Multiplication {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int [][] a = new int[2][2];
        int [][] b = new int[2][2];
        int [][] c = new int[2][2];


        System.out.println("Enter 4 Number :");
        // entering 4  numbers via Scanner Class

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a [i] [j] = mm.nextInt();
            }
        }
        System.out.println("Enter 4 Number :");
        // entering 4  numbers via Scanner Class

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b [i] [j] = mm.nextInt();
            }
        }// multiplication of two matrix

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] = c[i][j]+a[i][k] + b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
