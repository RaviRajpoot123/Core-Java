import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner mm =new Scanner(System.in);
        int [] a = new int[5];
        int i,j, temp;
        System.out.println("Enter 5 numbers :");
        for (i = 0; i < 5 ; i++){
            a[i] = mm.nextInt();
        }
        System.out.println("Arrays are before sorting: ");
        for ( i = 0; i < 5; i++) {
            System.out.print( a[i]+" ");
        }
        for ( i = 0; i < 5; i++) {
            for (j = 0; j < 5-1; j++) {
                if (a[j]>a[j+1])
                {
                    temp = a[j]; //Taking value from a[j] bigger value into temp var
                    a[j] = a[j+1]; //assigning the smaller value of a[j+1] to a[j]
                    a[j+1]= temp; //Assigning the temp value to the a[j+1]

                }
            }
        }
        System.out.println();
        System.out.println("Arrays are after sorting: ");
        for ( i = 0; i < 5; i++) {
            System.out.print( a[i]+" ");
        }
    }
}


