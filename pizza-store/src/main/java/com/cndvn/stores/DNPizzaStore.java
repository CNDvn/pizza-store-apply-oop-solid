package com.cndvn.stores;

import com.cndvn.Pizza;
import com.cndvn.pizzas.dnPizzas.DNCheesePizza;
import com.cndvn.pizzas.dnPizzas.DNGreekPizza;
import com.cndvn.pizzas.dnPizzas.DNPepperoniPizza;
import com.cndvn.stores.base.PizzaStore;

public class DNPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new DNCheesePizza();
            case "greek":
                return new DNGreekPizza();
            case "pepperoni":
                return new DNPepperoniPizza();
            default:
                return null;
        }
    }

}
