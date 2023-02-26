package com.cndvn;

import com.cndvn.stores.DNPizzaStore;
import com.cndvn.stores.HCMPizzaStore;
import com.cndvn.stores.HUEPizzaStore;
import com.cndvn.stores.base.PizzaStore;

public final class App {

    public static void main(String[] args) {
        PizzaStore huePizzaStore = new HUEPizzaStore();
        huePizzaStore.orderPizza("cheese");
        PizzaStore dnPizzaStore = new DNPizzaStore();
        dnPizzaStore.orderPizza("cheese");
        PizzaStore hcmPizzaStore = new HCMPizzaStore();
        hcmPizzaStore.orderPizza("cheese");
    }
}
