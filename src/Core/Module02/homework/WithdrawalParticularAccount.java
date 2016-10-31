package Core.Module02.homework;

/*
You need to write method which withdraw money of particular account owner if he/she can.
Print name + NO of withdrawal if not possible and
name + sum of withdrawal + balance after withdrawal in other case.
Commission is 5% for all cases.
   Example
        Input
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            String ownerName = Ann
            double withdrawal = 100;
        Output
            Ann 100 145

        Input
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            String ownerName = Oww
            double withdrawal = 490;
        Output
            Oww NO
*/

public class WithdrawalParticularAccount {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
//        String ownerName = "Ann";
//        double withdrawal = 100;
        String ownerName = "Oww";
        double withdrawal = 490;
        int index = 0;
        for (String item : ownerNames) {
            if (item.equals(ownerName)) {
                System.out.print(ownerName + " ");
                withdrawal(withdrawal, balances, index);
            }
            index++;
        }
    }

    private static void withdrawal(double withdrawal, int[] balances, int index) {
        double commission = 5;
        double withdrawCommission = withdrawal * commission / 100;
        double withdraw = withdrawal + withdrawCommission;
        if (withdraw > balances[index]) {
            System.out.println("NO");
        } else {
            balances[index] -= withdraw;
            System.out.println(withdrawal + " " + balances[index]);
        }
    }
}
