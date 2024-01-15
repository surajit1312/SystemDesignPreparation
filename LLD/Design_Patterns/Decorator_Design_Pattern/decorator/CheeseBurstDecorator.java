package LLD.Design_Patterns.Decorator_Design_Pattern.decorator;

import LLD.Design_Patterns.Decorator_Design_Pattern.pizza.BasePizza;

public class CheeseBurstDecorator extends ToppingsDecorator {

    BasePizza pizza;

    public CheeseBurstDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 90;
    }

}
