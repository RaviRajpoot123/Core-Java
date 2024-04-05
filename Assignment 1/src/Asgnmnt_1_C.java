import java.util.Scanner;

/* Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
*//*SI = P × R × T, where P = Principal, R = Rate of Interest, and T = Time period. Here,
the rate is given in percentage (r%) is written as r/100 */
public class Asgnmnt_1_C {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("We are going to find out the si by having principal , time, rate");
        System.out.println("Enter principal amount");
        double princ = mm.nextDouble();
        System.out.println("Enter Rate of Interest % ");
        double ROI = mm.nextDouble();
        System.out.println("Enter number of years  ");
        double time = mm.nextDouble();
        double SI =( princ * time * ROI)/100;

        System.out.println(SI + "/-");



    }
}
