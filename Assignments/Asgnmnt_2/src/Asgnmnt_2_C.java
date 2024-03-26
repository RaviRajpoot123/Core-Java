import java.util.Scanner;

/*. Area Of Rectangle Program */
public class Asgnmnt_2_C {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double pi = 3.14, area;
        System.out.println("Enter the height & base to calculate the area of rectangle ");
        System.out.println("Enter Width of rectangle");
        double width = mm.nextDouble();
        System.out.println("Enter length of triangle");
        double length = mm.nextDouble();
        area = (length * width);
        System.out.println("Area of rectangle is " + area);
    }
}
