package com.cndvn.stores;

import com.cndvn.Pizza;
import com.cndvn.pizzas.hcmPizzas.HCMCheesePizza;
import com.cndvn.pizzas.hcmPizzas.HCMGreekPizza;
import com.cndvn.pizzas.hcmPizzas.HCMPepperoniPizza;
import com.cndvn.stores.base.PizzaStore;

public class HCMPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new HCMCheesePizza();
            case "greek":
                return new HCMGreekPizza();
            case "pepperoni":
                return new HCMPepperoniPizza();
            default:
                return null;
        }
    }

}
