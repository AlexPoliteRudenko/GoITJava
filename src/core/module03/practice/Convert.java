package core.module03.practice;

public class Convert {
    private double currency;


    Convert(double currency) {
        this.currency = currency;
    }

    private double convert(double summ){
        return summ / getCurrency();
    }

    public double getCurrency() {
        return currency;
    }
}
