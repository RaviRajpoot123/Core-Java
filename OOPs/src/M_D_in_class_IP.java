// user Defined M_D_IN Class
import java.util.Scanner;
class Demo3 {
            Scanner mm = new Scanner(System.in);

             String name;
             int roll;
              double per;

       public void Enter()
       {
           System.out.println("Enter Name : ");
            name = mm.next();

           System.out.println("Enter Roll : ");
           roll = mm.nextInt();

           System.out.println("Enter Per : ");
            per = mm.nextDouble();
       }


        public void display()
        {
            System.out.println("Student Name : "+name);
            System.out.println("Student Roll_Num : "+roll);
            System.out.println("Student Per : "+per);

        }

    }
    class M_D_in_class_UD
    {
        public static void main(String[] args)
        {
            Demo3 obj = new Demo3();
            obj.Enter();
            obj.display();


        }
    }



