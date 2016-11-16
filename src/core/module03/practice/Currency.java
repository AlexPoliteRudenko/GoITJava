package core.module03.practice;

public class Currency {
    private double currency;


    Currency(double currency) {
        this.currency = currency;
    }

    private double convert(double summ){
        return currency * summ;
    }

}
