package core.module02.homework;

public class BankWithdraw {
    public static void main(String[] args) {
        withdrawal(100,10,5);
        withdrawal(100,99,5);
        withdrawal(10_000_000,10_000,.05);
        withdrawal(100_000_000_000L, 18_467_532, 0.33);
    }

    private static void withdrawal(long balance, long withdraw, double commission) {
        int accuracy = 10000;
        balance *= accuracy;
        withdraw *= accuracy;
//        double commission = 5;
        commission *= accuracy / 100;

        long withdrawal = withdraw + (withdraw * (long) commission) / accuracy;
        long commissionWithdraw = (withdraw * (long) commission) / accuracy;

        if (withdrawal > balance) {
            System.out.println("NO");
            System.out.println();
        } else {
            balance -= withdrawal;
            System.out.print("YES ");
            System.out.print(commissionWithdraw / accuracy + "," + commissionWithdraw * 100 / accuracy % 100 + " ");
            System.out.println(balance / accuracy + "," + balance * 100 / accuracy % 100 + " ");
            System.out.println();
        }

    }


}
