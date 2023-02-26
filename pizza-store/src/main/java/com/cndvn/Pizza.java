package com.cndvn;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();
    protected String type;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        toppings.forEach(topping -> System.out.println("\t" + topping));
    }

    public void bake() {
        System.out.println("Baking " + name + " in 30 mins");
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void Box() {
        System.out.println("Boxing " + name);
    }
}
