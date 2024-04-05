import java.util.Scanner;

/* Take name as input and print a greeting message for that particular name.
*/
public class _1_2_Greatings {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = mm.nextLine();
        System.out.println();
        System.out.println("Nice to meet you , " + name + " !");
    }
}
