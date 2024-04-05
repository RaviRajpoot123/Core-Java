class Power {
    int num, pow;

    public Power(int num, int pow) {
        this.num = num;
        this.pow = pow;
        int res = 1;
        if (pow == 0) {
            System.out.println("***************************************************Result***************************************************");
            System.out.println(res);
        } else {
            int i = pow;
            while (i >= 1) {
                res = res * num;
                i--;
            }

            System.out.println("***************************************************Result***************************************************");
            System.out.println(res);

        }


    }
}

public class _4_7_PowerMethod {
    public static void main(String[] args) {
        Power mm = new Power(2, 5);
    }

}
