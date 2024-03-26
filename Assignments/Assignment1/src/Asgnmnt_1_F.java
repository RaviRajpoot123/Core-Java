import java.util.Scanner;

/*Input currency in rupees and output in USD.*/
public class Asgnmnt_1_F {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter number of Indian rupees : ");
        double Rupee = mm.nextDouble();
        double USD = Rupee / 80;
        System.out.println("Currency in USD is $ " + USD);
    }
}
