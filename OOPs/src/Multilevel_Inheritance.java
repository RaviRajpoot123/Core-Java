class C extends B{
    int z ;
    void multi(int d){
        z = d * c;
        System.out.println("Multi of Addition & Given number: " + z);
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
       C obj = new C();
        obj.disp(5,10);
        obj.add(2,4);
        obj.multi(10);

    }
}

