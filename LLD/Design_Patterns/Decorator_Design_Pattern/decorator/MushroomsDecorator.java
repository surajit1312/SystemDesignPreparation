package LLD.Design_Patterns.Decorator_Design_Pattern.decorator;

import LLD.Design_Patterns.Decorator_Design_Pattern.pizza.BasePizza;

public class MushroomsDecorator extends ToppingsDecorator {

    BasePizza pizza;

    public MushroomsDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 50;
    }
}
