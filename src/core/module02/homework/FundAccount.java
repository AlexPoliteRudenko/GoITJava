package core.module02.homework;

/*
You need to write method which will fund (пополнение) balance of particular user.
   Print name + balance after funding

        Input
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            String ownerName = Oww
            double withdrawal = 100;
        Output
            Oww 600
*/

public class FundAccount {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Oww";
        double withdrawal = 100;
        for (int i = 0; i < ownerNames.length - 1; i++) {
            if (ownerNames[i].equals(ownerName)) {
                System.out.print(ownerName + " ");
                balances[i] += withdrawal;
                System.out.println(balances[i]);
            }
        }
    }
}

