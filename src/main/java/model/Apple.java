package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.NULL;
import static model.constants.Discount.SIXTY;
public class Apple extends Food {
    String colour;
    public Apple(int appleAmount, double applePrice, String colour) {
        super(appleAmount, applePrice, true);
        this.colour = colour;
    }
    @Override
    public int getDiscount() {
        int discount = NULL;
        if (colour.equalsIgnoreCase(RED)) {
            discount = SIXTY;
            return discount;
        }
        return discount;
    }
}
