package Core.Module02.homework;

public class BankWithdraw {
    public static void main(String[] args) {
        withdrawal(100,10,5);
        withdrawal(100,99,5);
        withdrawal(10000000,10000,.05);
        withdrawal(100000000000L, 18467532, 0.33);
    }

    public static void withdrawal(long balance, long withdraw, double commision) {
        int accuracy = 10000;
        balance *= accuracy;
        withdraw *= accuracy;
//        double commision = 5;
        commision *= accuracy / 100;

        long withdrawal = withdraw + (withdraw * (long) commision) / accuracy;
        long commisionWithdraw = (withdraw * (long) commision) / accuracy;

        if (withdrawal > balance) {
            System.out.println("NO");
            System.out.println();
        } else {
            balance -= withdrawal;
            System.out.print("YES ");
            System.out.print(commisionWithdraw / accuracy + "," + commisionWithdraw * 100 / accuracy % 100 + " ");
            System.out.println(balance / accuracy + "," + balance * 100 / accuracy % 100 + " ");
            System.out.println();
        }

    }


}
