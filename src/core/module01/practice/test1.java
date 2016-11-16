package core.module01.practice;

public class test1 {
    public static void main(String[] args) {
        int[] balances = {400, 1600, -299, 4980, 0, 61};
        String[] names = {"Mari", "Alexander", "Kate", "Paul", "Ivan", "Yuri"};
        int count = 0;
        for(int bal : balances){
            if (bal > 1000){
                count++;
            }
        }
//        String[] owners = String[count];
//        System.out.println(names[0]);
        for (int i = 0; i < balances.length - 1 ; i++) {
            if (balances [i] > 1000) {
                System.out.println(names[i] + " have more then 1000");
            }
        }
    }
}
