import java.util.Scanner;


public class Add2Matrix {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int [][] a = new int[3][3];
        System.out.println("Enter 9 Number :");
        // entering 9  numbers via Scanner Class
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a [i] [j] = mm.nextInt();
            }
        }
        int [][] b = new int[3][3];
        int [][] c = new int[3][3];
        System.out.println("Enter 9 Number :");
        // entering 9  numbers via Scanner Class
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b [i] [j] = mm.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c [i] [j] = a [i][j] + b[i][j];
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
    }
}
