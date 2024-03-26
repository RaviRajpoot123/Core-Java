import java.util.Scanner;

public class POD {
    public static void main(String [] xyz){
        int n ,prdct = 1 ,rem;
        Scanner mm= new Scanner(System.in);
        System.out.println("Enter to know Product Of Digit : ");
        n = mm.nextInt();
        for( ; n> 0; n= n/10){
            rem = n%10;
            prdct = prdct * (rem);

        }
        System.out.println("The POD of Entered number is : " + prdct);
    }
}
