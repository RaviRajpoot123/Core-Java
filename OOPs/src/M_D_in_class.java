//method declaration in class
class Demo2 {
    int roll = 102;
    String  name = "Puneet";
    double per = 89.3;
    public void display(){
        System.out.println("Student Name : "+name);
        System.out.println("Student Roll_Num : "+roll);
        System.out.println("Student Per : "+per);

    }

}
public class M_D_in_class
    {
        public static void main(String[] args) {
            Demo2 obj = new Demo2();
            obj.display();

        }
    }


