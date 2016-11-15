package Core.Module03.Practice;

public class Currency {
    private double currency;


    Currency(double currency) {
        this.currency = currency;
    }

    private double convert(double summ){
        return currency * summ;
    }

}
