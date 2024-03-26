import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner mm =new Scanner(System.in);

        int [] a = new int[5];
        int i,j, temp,k;
       System.out.println("Enter 5 numbers :");
        for (i = 0; i < 5 ; i++){
            a[i] = mm.nextInt();
        }
        System.out.println("Arrays are before sorting: ");
        for ( i = 0; i < a.length; i++) {
            System.out.print( a[i]+" ");
        }
        for ( i = 0; i < a.length; i++) {
            for (j = i+1; j < a.length; j++) {
                if (a[i] > a[j])
                {
                    temp = a[j];
                    for ( k = j; k > i ; k--) {

                        a[k] = a[k-1];

                    }
                    a[k] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Arrays are after sorting: ");
        for ( i = 0; i < a.length; i++) {
            System.out.print( a[i]+" ");
        }System.out.println();
    }
}
