import java.util.Scanner;
import java.math.*;
/*Area Of Isosceles Triangle A = ½[√(a2 − b2 ⁄4) × b]*/
public class Asgnmnt_2_D {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double pi = 3.14, area;
        System.out.println("Enter the height & base to calculate the area of triangle ");
        System.out.println("Enter Base of triangle");
        double base = mm.nextDouble();
        System.out.println("Enter equal size of triangle");
        double eqside = mm.nextDouble();
        area = (((eqside * eqside) - (base * base)/4)*base);
        System.out.println("Area of triangle is " + area);
    }
}
