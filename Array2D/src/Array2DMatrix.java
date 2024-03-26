import java.util.Scanner;
public class Array2DMatrix {
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a [i] [j]+" ");
            }
            System.out.println();
        }
    }
}
