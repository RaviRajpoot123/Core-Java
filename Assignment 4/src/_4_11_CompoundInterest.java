import java.util.Scanner;

public class _4_11_CompoundInterest {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double baseValue, compoundValue = 0, year, interestRate, compoundInterest, oldBaseValue;
        int itr = 0;
        System.out.println("Enter the base Value");
        baseValue = mm.nextDouble();
        oldBaseValue = baseValue;

        System.out.println("Enter the interest rate");
        interestRate = mm.nextDouble();
        System.out.println("Enter the number of years");
        year = mm.nextDouble();
        while (itr <= year) {
            compoundValue = baseValue;
            baseValue = baseValue + (baseValue * interestRate / 100);
            itr++;
        }


        compoundInterest = (compoundValue - oldBaseValue);
        System.out.println("*********************************************************CompoundInterest*********************************************************");
        System.out.println(compoundInterest + " %");
    }
}
