import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {


        Scanner mm = new Scanner(System.in);
        int [] a = {15, 25 ,36 , 5 ,10 ,22 ,9};
        int [] b = new int[7];

        int max= a.length-1,min = 0,i,j,mid =0,temp,flag = 0;
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

        System.out.println("Arrays are after sorting: ");
        for ( i = 0; i < a.length; i++) {

            b[i]=a[i];
            System.out.print( b[i]+" ");
        }
        System.out.println();

        System.out.println("Enter a number to search in array :");
        int n = mm.nextInt();

        while (min<=max){
            mid = (min+max)/2;
            if (n==b[mid]){
                flag+= 1;
            } else if (n<b[mid]) {
                max = mid -1;
            } else{
                min = mid + 1;
            }
            if (flag == 1){
                System.out.println("Found At : "+mid);
                break;
            }
        }

    }
}

