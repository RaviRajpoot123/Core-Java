import java.util.Scanner;

public class _4_4_DiscountOnProduct {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double productBasePrice, productDiscountPrice, discountPercentage;
        System.out.println("Enter the base price of product ");
        productBasePrice = mm.nextDouble();
        System.out.println("Enter the discount percentage % ");
        discountPercentage = mm.nextDouble();

        productDiscountPrice = productBasePrice - discountPercentage * (productBasePrice / 100);
        System.out.println("*****************************************************DiscountedPrice*****************************************************");
        System.out.println(productDiscountPrice);

    }
}
