import java.util.ArrayList;
import java.util.Scanner;

public class _4_19_HCFOfTwoNumber {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        int itr = 1, num1, num2, count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter number 1");
        num1 = mm.nextInt();
        System.out.println("Enter number 2");
        num2 = mm.nextInt();
        while (itr <= num1 && itr <= num2) {

            if (num1 % itr == 0 && num2 % itr == 0) {
                arrayList.add(count, itr);
                count++;
            }

            itr++;
        }
        System.out.println("*********************************HCFOfTwoNumber********************************************");
        System.out.print(arrayList + " ");
    }
}
