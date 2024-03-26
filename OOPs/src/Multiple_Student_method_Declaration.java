import java.util.Scanner;
class Demo8 {
    Scanner mm = new Scanner(System.in);

    String name;
    int roll;
    double per;
    int n;

    public void Enter()
    {
        System.out.println("Enter how many Students are for entry ");
         n = mm.nextInt();
        for (int i = 0; i < n; i++) {


            System.out.println("Enter Name : ");
            name = mm.next();

            System.out.println("Enter Roll : ");
            roll = mm.nextInt();

            System.out.println("Enter Per : ");
            per = mm.nextDouble();
        }
    }


    public void display()
    {
        for (int i = 0; i < n; i++) {


            System.out.println("*************************************Output**********************************************");
            System.out.println("Student Name : "+name);
            System.out.println("Student Roll_Num : "+roll);
            System.out.println("Student Per : "+per);
            System.out.println("*************************************Output**********************************************");
    }
    }

}

public class Multiple_Student_method_Declaration {
    public static void main(String[] args) {
        Demo8 obj = new Demo8();
        obj.Enter();
        obj.display();
    }
}
