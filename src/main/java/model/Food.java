package model;

public abstract class Food implements Discountable  {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    public int getAmount() {
        return amount;
    }
    public double getPrice() {
        return price;
    }
    public boolean IsVegetarian() {
        return isVegetarian;
    }
    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
}
