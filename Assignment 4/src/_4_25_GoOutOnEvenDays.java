public class _4_25_GoOutOnEvenDays {
    public static void main(String[] args) {
        /*As we all know August have 31 days*/
        int augustMonthDays = 31, itr = 0, count = 0;
        while (itr <= augustMonthDays) {
            if (itr % 2 == 0) {
                count++;
            }
            itr++;
        }
        System.out.println("********************************************NumberOfDaysPuneetCanGoOutWitFriends********************************************");
        System.out.println(count);
    }
}
