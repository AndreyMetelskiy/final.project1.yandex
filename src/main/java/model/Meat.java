package model;

import static model.constants.Discount.NULL;

public class Meat extends Food {
     public Meat(int meatAmount, double meatPrice){
         super(meatAmount,meatPrice,false);
     }
     @Override
     public int getDiscount() {
         int discount= NULL;
         return discount;
     }
 }
