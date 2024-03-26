import java.util.Scanner;

public class ArrUD_E_OD_1 {
    public static void main(String[] args) {
        int [] a = new int[10];
        int evensum = 0, oddsum = 0;
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            a [i] = mm.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(a[i]%2==0){
               evensum = evensum + a[i];
            }else{
                oddsum = oddsum+a[i];
            }
        }
        System.out.println("Even Sum: "+evensum);
        System.out.println("Odd Sum : "+oddsum);
    }
}
