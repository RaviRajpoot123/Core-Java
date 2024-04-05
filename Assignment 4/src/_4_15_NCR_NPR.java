import java.util.Scanner;

public class _4_15_NCR_NPR {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        // npr = n!/(n-r)! ncr = n!/ r!(n-r)!
        int choice;
        long result, nFact=1, rFact = 1, n_rFact = 1, n, r;
        //System.out.println("Enter the value ");
        //value = mm.nextInt();
        System.out.println("Enter the value of n");
        n = mm.nextInt();
        System.out.println("Enter the value of r");
        r = mm.nextInt();

        while (n >= 0) {
            if (n == 0 || n == 1) {

                System.out.println("**********************************************************Output**********************************************************");
                System.out.println("The factorial of n is : " + nFact);
                break;
            } else {
                while (n > 1) {
                    nFact = nFact * n;
                    n--;
                }
                System.out.println("**********************************************************Output**********************************************************");
                System.out.println("The factorial of n is : " + nFact);
                break;
            }
        }
        while (r >= 0) {
            if (r == 0 || r == 1) {

                System.out.println("**********************************************************Output**********************************************************");
                System.out.println("The factorial is r : " + rFact);
                break;
            } else {
                while (r > 1) {
                    rFact = rFact * r;
                    r--;
                }
                System.out.println("**********************************************************Output**********************************************************");
                System.out.println("The factorial of r is : " + rFact);
                break;
            }
        }

            while ((n - r) >= 0 ) {
                if ((n - r) == 0 || (n-r) == 1) {

                    System.out.println("**********************************************************Output**********************************************************");
                    System.out.println("The factorial of n-r is : " + n_rFact);
                    break;
                } else {
                    while ((n - r) > 1) {
                        n_rFact = n_rFact * (n-r);
                        n--;
                        r--;
                    }
                    System.out.println("**********************************************************Output**********************************************************");
                    System.out.println("The factorial is : " + n_rFact);
                    break;
                }
            }
        if (n <= r) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("What are we going to do? 1. nCr, 2. nPr");
            choice = mm.nextInt();
            switch (choice) {
                case 1: {
                    result = nFact / n_rFact;
                    System.out.println("**********************************************************Output**********************************************************");
                    System.out.println("nCr is : " + result);

                    break;

                }

                case 2: {
                    result = nFact / (rFact * n_rFact);
                    System.out.println("**********************************************************Output**********************************************************");
                    System.out.println("nPr is : " + result);
                    break;
                }
                default: {
                    System.out.println("**********************************************************Output**********************************************************");
                    System.out.println("Invalid Input");
                }
            }

        }
    }
}
