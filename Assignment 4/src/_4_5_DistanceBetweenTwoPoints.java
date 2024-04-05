import java.util.Scanner;

public class _4_5_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double speed, time, distance;
        System.out.println("Enter the speed to travel between two points in KM/H ");
        speed = mm.nextDouble();
        System.out.println("Enter the time you have taken in hour");
        time = mm.nextDouble();
        distance = (speed) * (time);
        System.out.println("************************************************************************DistanceBetweenTwoPoints************************************************************************");
        System.out.println(distance);

    }
}
