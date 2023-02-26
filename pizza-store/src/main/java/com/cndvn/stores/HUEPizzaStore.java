package com.cndvn.stores;

import com.cndvn.Pizza;
import com.cndvn.pizzas.huePizzas.HUECheesePizza;
import com.cndvn.pizzas.huePizzas.HUEGreekPizza;
import com.cndvn.pizzas.huePizzas.HUEPepperoniPizza;
import com.cndvn.stores.base.PizzaStore;

public class HUEPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new HUECheesePizza();
            case "greek":
                return new HUEGreekPizza();
            case "pepperoni":
                return new HUEPepperoniPizza();
            default:
                return null;
        }
    }

}
