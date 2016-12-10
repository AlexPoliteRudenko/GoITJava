package core.module04.homework;

public class Main {
    public static void main(String[] args) {

//         Banks
        Bank bank1 = new USBank(12, "USA", Currency.USD, 30, 20000, 5, 1000000);
        Bank bank2 = new USBank(10, "Canada", Currency.EUR, 100, 15000, 3, 2000000);
        Bank bank3 = new EUBank(23, "France", Currency.EUR, 150, 10000, 10, 4000000L);
        Bank bank4 = new EUBank(30, "Germany", Currency.USD, 120, 14000, 8, 3500000L);
        Bank bank5 = new ChinaBank(1120, "China", Currency.EUR, 1020, 8000, 25, 300500000L);
        Bank bank6 = new ChinaBank(1300, "China", Currency.USD, 923, 7500, 45, 200500000L);

//         Users
        User user1 = new User(12983736256L, "Ivan", 223, 23, "Company1", 23000, bank1);
        User user2 = new User(23985746389L, "Alex", 2200, 2, "Company2", 5000, bank2);
        User user3 = new User(16278493726L, "Vova", 874, 10, "CML", 12000, bank3);
        User user4 = new User(38926473848L, "Lida", 10043, 30, "GT", 6800, bank4);
        User user5 = new User(20098783783L, "Daria", 9456, 9, "Dance Acadamy", 11000, bank5);
        User user6 = new User(30029788439L, "Illia", 35640, 44, "Cherry", 40000, bank6);

        //
        BankSystemImpl implementation = new BankSystemImpl();
        User[] users = {user1, user2, user3, user4, user5, user6};
//        Test
        for (User user : users) {
            System.out.println(user.getName() + " balance properties before operations:");
            System.out.println(user.toString());

            implementation.withdrawOfUser(user, 1100);
            implementation.fundUser(user, 15000);
            implementation.paySalary(user);
            if (user != user2) {
                implementation.transferMoney(user, user2, 20000);
            } else {
                implementation.transferMoney(user, user4, 20000);
            }
            System.out.println();
            System.out.println(user.getName() + " balance properties after operations:");
            System.out.println(user.getBalance());
            System.out.println();
        }
    }
}
