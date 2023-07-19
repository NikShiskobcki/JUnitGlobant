package Models;

public class DiscountCalculator {
    private double prodPrice;
    private double discount;

    public DiscountCalculator(double prodPrice, double discount) {
        this.prodPrice = prodPrice;
        this.discount = discount;

    }
    public DiscountCalculator() {
    }

    public double getProdPrice() {
        return prodPrice;
    }
    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public double getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
