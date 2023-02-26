package com.cndvn;

public class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza;
        System.out.println("--------Ordering pizza...--------");
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                System.out.println("We do not have " + type + " pizza");
                return;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.Box();
    }
}
