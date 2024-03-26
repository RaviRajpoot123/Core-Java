import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        /*Food Corner home delivers vegetarian and non-vegetarian meals to
         its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate.
 Apart from the cost per plate of food, customers are also charged for home delivery based
 on the distance in kms from the restaurant to the delivery point. The delivery charges are
  as mentioned below:



Given the type of food, quantity (no. of plates) and the distance in
kms from the restaurant to the delivery point, implement a program to
 calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided
 by the customer:

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.


*/
        int vc = 12, nvc = 15,qt;
        double dis ,delc, bill = 0 ;
        Scanner mm = new Scanner(System.in);
        System.out.println("What you want? 1.vc 2.nvc");
        int i = mm.nextInt();
        switch (i){
            case 1:{
                System.out.println("You have chosen VC. How much you need?");
                qt = mm.nextInt();
                if (qt>0){
                    System.out.println("You have chosen " + qt +" NVC ");
                    System.out.println("Enter how much dis is from our outlet");
                    dis = mm.nextInt();
                    if (dis>0&&dis<=3){
                        delc = 0;
                        bill = (vc * qt) + delc;
                    } else if (dis>3 && dis<6) {
                        delc = 1;
                        bill = (vc * qt) + delc;
                    }else {
                        delc = 2;
                        bill = (vc * qt) + delc;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("You have chosen NVC. How much you need?");
                qt = mm.nextInt();
                if (qt > 0) {
                    System.out.println("You have chosen " + qt + " NVC ");
                    System.out.println("Enter how much dis is from our outlet");
                    dis = mm.nextInt();
                    if (dis > 0 && dis <= 3) {
                        delc = 0;
                        bill = (nvc * qt) + delc;
                    } else if (dis > 3 && dis < 6) {
                        delc = 1;
                        bill = (nvc * qt) + delc;
                    } else {
                        delc = 2;
                        bill = (nvc * qt) + delc;
                    }
                }
                break;
            }
            default:
                System.out.println("-1");
                break;
        }
        System.out.println(bill);

    }


}

