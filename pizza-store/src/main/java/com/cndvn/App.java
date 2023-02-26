package com.cndvn;

public final class App {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza("cheese");
        store.orderPizza("greek");
        store.orderPizza("pepperoni");
        store.orderPizza("haha");
    }
}
