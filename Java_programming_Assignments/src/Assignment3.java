import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int prdct = 1;
        /*Implement a program to calculate the product
         of three positive integer values. However, if
          one of the integers is 7, consider only the
          values to the right of 7 for calculation.
          If 7 is the last integer, then display -1.

          Note: Only one of the three values can be 7.*/
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int n1 = mm.nextInt();
        System.out.println("Enter number 2 : ");
        int n2 = mm.nextInt();
        System.out.println("Enter number 3 : ");
        int n3 = mm.nextInt();
       
            if (n1==7&&n2!=7&&n3!=7){
                prdct = prdct *n2*n3;
            } else if (n1!=7&&n2==7&&n3!=7) {
                prdct = prdct* n3;
            } else if (n3==7) {
                prdct = -1;
            }else {
                prdct = prdct * n1 * n2 * n3;
            }
        System.out.println(prdct);
    }
}
