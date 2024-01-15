package LLD.Design_Patterns.Decorator_Design_Pattern;

import LLD.Design_Patterns.Decorator_Design_Pattern.decorator.CheeseBurstDecorator;
import LLD.Design_Patterns.Decorator_Design_Pattern.decorator.MushroomsDecorator;
import LLD.Design_Patterns.Decorator_Design_Pattern.pizza.BasePizza;
import LLD.Design_Patterns.Decorator_Design_Pattern.pizza.FarmHousePizza;
import LLD.Design_Patterns.Decorator_Design_Pattern.pizza.MargheritaPizza;
import LLD.Design_Patterns.Decorator_Design_Pattern.pizza.VeggieDelightPizza;

public class PizzaBuilder {
    public static void main(String[] args) {
        BasePizza margheritaPizza = new MushroomsDecorator(new CheeseBurstDecorator(new MargheritaPizza()));
        int margheritaPizzaCost = margheritaPizza.cost();
        System.out.println("Cost of Margherita Pizza with Extra Cheese and Mushrooms : " + margheritaPizzaCost);

        BasePizza veggiePizza = new MushroomsDecorator(new VeggieDelightPizza());
        int veggiePizzaCost = veggiePizza.cost();
        System.out.println("Cost of Veggie Delight Pizza with Extra Mushrooms : " + veggiePizzaCost);

        BasePizza farmHousePizza = new CheeseBurstDecorator(new FarmHousePizza());
        int farmHousePizzaCost = farmHousePizza.cost();
        System.out.println("Cost of FarmHouse Pizza with Extra Cheese : " + farmHousePizzaCost);
    }
}
