import java.util.ArrayList;
import java.util.Scanner;

public class _4_20_LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int itr =1  , count = 0;
        long LCM, num1, num2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter number 1");
        num1 = mm.nextInt();
        System.out.println("Enter number 2");
        num2 = mm.nextInt();
        while (itr <= num1 && itr <=num2){

            if (num1%itr==0&&num2%itr==0){
                arrayList.add(count,itr);
                count++;
            }

            itr++;
        }
        LCM = (num1*num2)/arrayList.get(arrayList.size()-1);
        System.out.println("**************************************************LCMOfTwoNumber**************************************************");
        System.out.println(LCM);
    }
}
