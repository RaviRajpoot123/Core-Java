import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class _4_17_PalindromeNumberChecking {
    public static void main(String [] xyz){
        int num ,count = 0 ,rem,itr = 0;
        Scanner mm= new Scanner(System.in);
        System.out.println("Enter a number");
        num = mm.nextInt();
        ArrayList <Integer> arrayList1 = new ArrayList<>();
        for( ; num> 0; num= num/10){
            rem = num%10;

            arrayList1.add(itr,rem);
            itr ++;
        }

        for (int itr1 = 0; itr1 < arrayList1.size(); itr1++) {

                if(Objects.equals(arrayList1.get(itr1), arrayList1.get(itr1))){
                    count++;
                }
            }
    if (count== arrayList1.size()){
        System.out.println("Number is Palindrome ");
    }else {
        System.out.println("Number is not Palindrome");
    }
    }

}
