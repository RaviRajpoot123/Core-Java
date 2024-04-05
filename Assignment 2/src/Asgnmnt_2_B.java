import java.util.Scanner;
/*Area Of Triangle*/
public class Asgnmnt_2_B {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double pi = 3.14, area;
        System.out.println("Enter the height & base to calculate the area of triangle ");
        System.out.println("Enter Base of triangle");
        double base = mm.nextDouble();
        System.out.println("Enter height of triangle");
        double height = mm.nextDouble();
        area = (height * base)/2;
        System.out.println("Area of triangle is " + area);
    }
}
