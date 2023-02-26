package com.cndvn.stores.base;

import com.cndvn.Pizza;

public abstract class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.Box();
    }

    protected abstract Pizza createPizza(String type);

            // System.out.println("--------Ordering pizza...--------");
        // switch (type) {
        //     case "cheese":
        //         pizza = new CheesePizza();
        //         break;
        //     case "greek":
        //         pizza = new GreekPizza();
        //         break;
        //     case "pepperoni":
        //         pizza = new PepperoniPizza();
        //         break;
        //     default:
        //         System.out.println("We do not have " + type + " pizza");
        //         return;
        // }
}
