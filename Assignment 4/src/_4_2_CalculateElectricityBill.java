import java.util.Scanner;

public class _4_2_CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double perUnitPrice = 7.5, electricityBill, hour, day;
        System.out.println("Enter number of days ");
        day = mm.nextDouble();

        System.out.println("Enter number of hours ");
        hour = mm.nextDouble();

        if (hour > 24) {
            System.out.println("Invalid hour");
        } else {
            electricityBill = hour * day * perUnitPrice;
            System.out.println("***************************************************************Electricity bill***************************************************************");
            System.out.println(electricityBill);
        }
    }
}
