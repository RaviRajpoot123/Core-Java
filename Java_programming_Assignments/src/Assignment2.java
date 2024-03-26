public class Assignment2 {
    public static void main(String[] args) {
            /*Quadratic equation is an equation with degree 2 in the form of
            ax2 +bx + c = 0 where a, b and c are the coefficients.
            Implement a program to solve a quadratic equation.

            Find the discriminant value using the formula given below.

            discriminant = b2 - 4ac

            If the discriminant is 0, the values of both the roots will be same.
            Display the value of the root.

            If the discriminant is greater than 0, the roots will be unequal real
            roots. Display the values of both the roots.

            If the discriminant is less than 0, there will be no real roots. Display
            the message "The equation has no real root"

            Use the formula given below to find the roots of a quadratic equation.

            x = (-b ± discriminant)/2a

 */
            int a = 1, b = 4, c = 4;
            double dis = ((b*b)-4*a*c);
            double x1 = ((-b + dis)/2*a);
            double x2 = ((-b - dis)/2*a);
            System.out.println(x1 + " "+x2);
    }
}


