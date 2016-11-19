package core.module04.homework;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) {
            return 2000;
        } else if (this.getCurrency() == Currency.EUR) {
            return 2200;
        } else {
            return -1;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.USD) {
            return 10000;
        } else if (this.getCurrency() == Currency.EUR) {
            return 20000;
        } else {
            return -1;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) {
            return 0;
        } else if (this.getCurrency() == Currency.EUR) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                return 5;
            } else {
                return 7;
            }
        } else if (this.getCurrency() == Currency.EUR) {
            if (summ <= 1000) {
                return 2;
            } else {
                return 4;
            }
        } else {
            return -1;
        }
    }

}
