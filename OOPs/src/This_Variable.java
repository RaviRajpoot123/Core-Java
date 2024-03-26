class Demo7{
    String name;
    int roll;
    double per;
    /*Demo7(String name, int roll,double per){
        name = name;
        roll = roll;
        per = per;
    }
    *****************************************************output**********************************************************
    Student Name : null
    Student Roll_Num : 0
    Student Per : 0.0
    *********************************************************************************************************************
    */
    Demo7(String name, int roll,double per){
        this.name = name;
        this.roll = roll;
        this.per = per;
        /*
*****************************************************output**********************************************************
Student Name : Rasmxc
Student Roll_Num : 152
Student Per : 99.315
*****************************************************output***********************************************************/
    }
    public void display()
    {
        System.out.println("*****************************************************output**********************************************************");
        System.out.println("Student Name : "+name);
        System.out.println("Student Roll_Num : "+roll);
        System.out.println("Student Per : "+per);
        System.out.println("*****************************************************output**********************************************************");
    }

}
public class This_Variable {
    public static void main(String[] args) {
        Demo7 obj = new Demo7("Rasmxc", 152 ,99.315);
        obj.display();
    }
}
