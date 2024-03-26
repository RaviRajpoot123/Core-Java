import java.util.Scanner;

public class LinearSearchingInArr {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int [] a = {25 ,33 ,1 ,66 ,5 ,44};
        int i,flag=0;
        System.out.println("Enter any number to search in Array :");
        int n = mm.nextInt();
        for ( i = 0; i < a.length; i++)
        {
            if (n == a[i])
            {
                flag =1;

                System.out.println("Number is found out at index: " + i);
                break;
            }
        }
        if(flag==1)
            System.out.println("number found ");
        else
            System.out.println("Number not found ");
    }
}
