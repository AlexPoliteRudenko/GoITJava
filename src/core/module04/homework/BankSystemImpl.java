package core.module04.homework;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        System.out.print("Performing withdrawal of " + amount + " " + user.getBank().getCurrency() + "...");
        double balance = user.getBalance();
        int commissionWithdraw = user.getBank().getCommission(amount);
        double withdrawalCommission = amount * commissionWithdraw / 100;
        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
        if (amount > limitOfWithdrawal) {
            System.out.println("Canceled. This operation cannot be performed. " +
                    "You have exceeded the limit of withdrawal of " + user.getBank().getLimitOfWithdrawal() +
                    " in " + user.getBank().getClass().getSimpleName());
        } else {
            if (amount + withdrawalCommission > balance) {
                System.out.println("Canceled. This operation cannot be performed. " +
                        user.getName() + " has insufficient funds in the account");
            } else {
                System.out.println("Success!");
                user.setBalance(balance - amount - withdrawalCommission);
            }
        }

    }

    @Override
    public void fundUser(User user, int amount) {
        System.out.print("Performing funding balance for " + amount + " " + user.getBank().getCurrency() + "...");
        double balance = user.getBalance();
        int fundLimit = user.getBank().getLimitOfFunding();
        if (amount > fundLimit) {
            System.out.println("Canceled. This operation cannot be performed. " +
                    user.getName() + " have exceeded the limit of funding for " + user.getBank().getLimitOfWithdrawal() +
                    " in " + user.getBank().toString());

        } else {
            System.out.println("Success!");
            user.setBalance(balance + amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.print("Transfer " + amount + " from " + fromUser.getName() +
                " balance to " + toUser.getName() + "...");
        double fromBalance = fromUser.getBalance();
        double toBalance = toUser.getBalance();
        if (amount > fromBalance) {
            System.out.println("Canceled. This operation cannot be performed. " +
                    fromUser.getName() + " has insufficient funds in the account.");
        } else {
            fromUser.setBalance(fromBalance - amount);
            toUser.setBalance(toBalance + amount);
            System.out.println("Success!");
        }
    }

    @Override
    public void paySalary(User user) {
        double balance = user.getBalance();
        System.out.print("Paying salary" +
//                "(" + user.getSalary() + ")" +
                "...");
        user.setBalance(balance + user.getSalary());
        System.out.println("Success!");
    }
}
