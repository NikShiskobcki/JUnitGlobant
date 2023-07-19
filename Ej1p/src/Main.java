import Models.DiscountCalculator;
import Services.DiscCalcServ;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator c = new DiscountCalculator(100, 25);

        double d = DiscCalcServ.discount(c);

        System.out.println(d);
    }
}