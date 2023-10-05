package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public void getSumWithoutDiscount() {
        double sum = 0;
        for (Food food1 : food) {
            if (food1.IsVegetarian() == true) {
                sum = sum + food1.getPrice();

            } else {
                sum = sum + food1.getPrice() * food1.getAmount();
            }
        }
        System.out.println("Общая сумма товаров без скидки " + sum + " р");
    }
    public void getSumWithDiscount() {
        double sum = 0;
        for (int i = 0; i < food.length; i++) {

            if (food[i].IsVegetarian()) {

                if (food[i].getDiscount() > 0) {
                    sum = sum + food[i].getPrice() * food[i].getDiscount() / 100;
                } else {
                    sum = sum + food[i].getPrice();
                }
            } else {
                sum = sum + food[i].getPrice() * food[i].getAmount();
            }
        }
        System.out.println("Общая сумма товаров cо скидкой " + sum + " р");
    }
    public void getSumAppleWithoutDiscount() {
        double sum = 0;
        for (Food food1 : food) {
            if (food1.IsVegetarian() == true) {
                sum = sum + food1.getPrice();
            }
        }
        System.out.println("Cумма всех вегетарианских продуктов без скидки " + sum + " р");
    }
}