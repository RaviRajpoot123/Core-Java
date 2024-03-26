import java.util.Scanner;
class Demo4 {
    Scanner mm = new Scanner(System.in);
    public void disp(int a)
    {
        System.out.println(a);
    }
    public void disp(){
        System.out.println("Hello");
    }
    public void sum(int a , int b){
        System.out.println("Sum is : " + (a+b));
    }
    public void sum(double a , double b){
        System.out.println("Sum is : " + (a+b));
    }
    public void product(int a , double b){
        System.out.println(a+" * "+ b +"Product is : " + (a*b));
    }public void product(double a , int b){
        System.out.println(a+" * "+ b +"Product is : " + (a*b));
    }

}
class PolyMorphism {
    public static void main(String[] args)
    {
        Demo4 obj = new Demo4();
        obj.disp();
        obj.disp(55);
        obj.sum(1,25);
        obj.sum(2.65,25.3);
        obj.product(15.3,36);
        obj.product(55,36.9);
    }

}
