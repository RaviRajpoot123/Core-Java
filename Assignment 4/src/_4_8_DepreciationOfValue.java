import java.util.Scanner;

public class _4_8_DepreciationOfValue {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double baseValue, depreciatedValue = 0, year, interestRate, interestOfDepreciation, oldBaseValue;
        int itr = 0;
        System.out.println("Enter the base cost");
        baseValue = mm.nextDouble();
        oldBaseValue = baseValue;

        System.out.println("Enter the interest rate");
        interestRate = mm.nextDouble();
        System.out.println("Enter the number of years");
        year = mm.nextDouble();
        while (itr <= year) {
            depreciatedValue = baseValue;
            baseValue = baseValue - (baseValue * interestRate / 100);
            itr++;
        }


        interestOfDepreciation = (depreciatedValue - oldBaseValue);
        System.out.println("*******************************InterestOfDepreciated**********DepreciatedValue*********************************");
        System.out.println("Interest : " + interestOfDepreciation + " %, " + "Value : " + depreciatedValue);
    }
}
