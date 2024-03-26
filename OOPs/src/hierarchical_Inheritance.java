class Ad extends A{
    int z;
    void add(int a, int b){
        z = a + b;
        System.out.println("Addition of a & b is : " + z );
    }
}
class Mul extends A{
    int z;
    void mul(int a, int b){
        z = a * b;
        System.out.println("multi of a & b is : " + z );
    }
}
class Sub extends A{
    int z;
    void sub(int a, int b){
        z = a - b;
        System.out.println("Subtraction of a & b is : " + z );
    }
}
public class hierarchical_Inheritance {
    public static void main(String[] args) {

       Ad obj2 = new Ad();
       Mul obj3 = new Mul();
       Sub obj4 = new Sub();
       obj2.disp(1,2);
       obj2.add(3,4);
       obj3.mul(5,6);
       obj4.sub(7,8);
    }
}
