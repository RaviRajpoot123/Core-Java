import java.util.Scanner;

public class _4_12_CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        double sum = 0, maxMarks = 100, averageMarks;
        System.out.println("Enter number of subjects ");
        int numSubject = mm.nextInt();
        for (int i = 1; i <= numSubject; i++) {
            System.out.println("Enter the marks of subject out of 100 in subject :" + i);
            int mark = mm.nextInt();
            if (mark > maxMarks) {
                System.out.println("Invalid number");
                break;
            } else {
                sum = sum + mark;
            }
        }
        System.out.println("**********************************************************************AverageMarks**********************************************************************");
        averageMarks = sum / numSubject;
        System.out.println(averageMarks);


    }
}
