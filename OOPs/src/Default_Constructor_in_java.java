class Demo5 {
    String name;
    int roll;
    double per;

    Demo5(){
        System.out.println("Default Constructor Invoked ");
    }
    void disp(){
        System.out.println("Student Name is "+ name);
        System.out.println("Student rollnumber is "+ roll);

        System.out.println("Student per is "+ per);
    }

}
public class Default_Constructor_in_java {
    public static void main(String[] args) {
        Demo5 obj = new Demo5();
        obj.disp();
    }
}
