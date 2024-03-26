//Field Declaration in class
class Demo {
    int roll = 102;
    String  name = "Puneet";
    double per = 89.3;

}
class Field_Declaration_IN_Class
{
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Student Name : "+obj.name);
        System.out.println("Student Roll_Num : "+obj.roll);
        System.out.println("Student Per : "+obj.per);
    }
}
