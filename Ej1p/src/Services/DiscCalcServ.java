package Services;
import Models.DiscountCalculator;

public class DiscCalcServ {

    public static DiscountCalculator inst(double prodPrice, double discount){
        DiscountCalculator calculator = new DiscountCalculator(prodPrice, discount);
        return calculator;
    }

    public static double discount(DiscountCalculator c){
        double d = c.getProdPrice() - (c.getProdPrice() * (c.getDiscount()/100));
        return d;
    }
}
