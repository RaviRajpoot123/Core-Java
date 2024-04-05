import java.util.Scanner;

/*Area Of Circle Java Program*/
public class _2_1_AreaOfCircle {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double pi = 3.14, area;
        System.out.println("Enter the radius to calculate the area of circle ");
        double radius = mm.nextDouble();
        area = radius * radius * pi;
        System.out.println("Area of circle is " + area);
    }
}
