class A{
    int x,y;
    void disp(int a , int b){
        System.out.println("Value of x : " + a);
        System.out.println("Value of y : " + b);
    }
}
class B extends A{
    int c;
    void add(int a , int b){
        c = a + b;
        System.out.println("Addition : " + c);
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.disp(10,56);
        obj.add(55,66);
    }
}