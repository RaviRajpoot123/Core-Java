import java.util.Scanner;

public class _4_6_CalculateCommissionPercentage {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double baseCost, commissionCost, percentageCommission = 0, value;
        System.out.println("Enter the Base Cost");
        baseCost = mm.nextDouble();
        System.out.println("Enter the Commission Cost");
        commissionCost = mm.nextDouble();
        if (commissionCost < baseCost) {
            // discountPercentage = (productDiscountPrice -productBasePrice)*100/productBasePrice  ;
            value = ((commissionCost - baseCost) * 100 / baseCost);
            percentageCommission = 100 + value;

        } else {
            System.out.println("Commission cost can not be more than base cost");
        }
        System.out.println("************************************************************************CalculateCommissionPercentage************************************************************************");
        System.out.println(percentageCommission + " %");
    }
}
