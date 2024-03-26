import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner mm =new Scanner(System.in);

        int [] a = new int[5];
        int i,j, temp;
         System.out.println("Enter 5 numbers :");
        for (i = 0; i < 5 ; i++){
            a[i] = mm.nextInt();
        }
        System.out.println("Arrays are before sorting: ");
        for ( i = 0; i < a.length; i++) {
            System.out.print( a[i]+" ");
        }
        for ( i = 0; i < a.length; i++) {
            for (j = 0; j < a.length-1; j++) {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }

        System.out.println();
        System.out.println("Arrays are after sorting: ");
        for ( i = 0; i < a.length; i++) {
            System.out.print( a[i]+" ");
        }
    }
}
