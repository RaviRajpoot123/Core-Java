import java.util.Scanner;

public class _4_10_CalculateCGPA {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter number of subjects ");
        double sum = 0, maxMarks = 100, CGPA;
        int numSubject = mm.nextInt();
        for (int i = 1; i <= numSubject; i++) {
            System.out.println("Enter the marks of subject out of 100 " + i);
            int mark = mm.nextInt();
            if (mark > maxMarks) {
                System.out.println("Invalid number");
                break;
            } else {
                sum = sum + mark;
            }
        }
        System.out.println("**********************************************************************CGPA**********************************************************************");
        CGPA = sum * maxMarks / (1000 * numSubject);
        System.out.println(CGPA);


    }
}
