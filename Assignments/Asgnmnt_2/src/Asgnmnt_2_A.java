import java.util.Scanner;

/*Area Of Circle Java Program*/
public class Asgnmnt_2_A {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double pi = 3.14, area;
        System.out.println("Enter the radius to calculate the area of circle ");
        double radius = mm.nextDouble();
        area = radius * radius * pi;
        System.out.println("Area of circle is " + area);
    }
}
