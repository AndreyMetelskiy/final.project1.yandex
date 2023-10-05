package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10,50,RED );
        Apple greenApple = new Apple(8,60,GREEN );
        Food[] foods={meat,greenApple,redApple};
        ShoppingCart shoppingCart= new ShoppingCart(foods);
        shoppingCart.getSumWithoutDiscount();
        shoppingCart.getSumWithDiscount();
        shoppingCart.getSumAppleWithoutDiscount();
    }
}