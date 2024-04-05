import java.util.Scanner;

public class _4_18_FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double currentInvestmentValue, totalFutureInvestmentValue = 0, year, interestRate, compoundInterest, pastInvestmentValue;
        int itr = 0;
        System.out.println("Enter the Current Value are being used for future investment");
        currentInvestmentValue = mm.nextDouble();
        pastInvestmentValue = currentInvestmentValue;

        System.out.println("Enter the interest rate");
        interestRate = mm.nextDouble();
        System.out.println("Enter the number of years");
        year = mm.nextDouble();
        while (itr <= year) {
            totalFutureInvestmentValue = currentInvestmentValue;
            currentInvestmentValue = currentInvestmentValue + (currentInvestmentValue * interestRate / 100);
            itr++;
        }


        compoundInterest = (totalFutureInvestmentValue - pastInvestmentValue);
        System.out.println("*********************************************************CompoundInterest*********************************************************");
        System.out.println(totalFutureInvestmentValue + " Currency");
    }

}
