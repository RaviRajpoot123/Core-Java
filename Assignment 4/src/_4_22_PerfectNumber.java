import java.util.ArrayList;
import java.util.Scanner;

public class _4_22_PerfectNumber {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int itr = 1;
        int num, sum = 0, newNum;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter number a number");
        num = mm.nextInt();
        newNum = num;
        while (itr <= num) {

            if (num % itr == 0) {
                arrayList.add(count, itr);
                count++;
            }

            itr++;
        }
        for (int i = 0; i < arrayList.size()-1; i++) {
            sum = sum + arrayList.get(i);
        }
      //  System.out.println(arrayList);

        System.out.println("*********************************PerfectNumberChecking********************************************");
        if (newNum==sum){
        System.out.println("Number entered by user " + newNum + " " + "Number after calculation we get : " + sum + " Hence it is a perfect number");
    }else {
            System.out.println("Number entered by user " + newNum + " " + "Number after calculation we get : " + sum + " :  Hence it is not a perfect number");
        }}
}
