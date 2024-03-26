class Demo6 {
    String name;
    int roll;
    double per;

    Demo6(String n, int r,double p){
        name = n;
        roll = r;
        per = p;
    }
    void disp(){
        System.out.println("Student Name is "+ name);
        System.out.println("Student rollnumber is "+ roll);

        System.out.println("Student per is "+ per);
    }

}
public class Parameter_constructor_in_java {
    public static void main(String[] args) {
        Demo6 obj = new Demo6("Ravi",5,56.31);
        obj.disp();
    }
}
