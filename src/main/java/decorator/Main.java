package decorator;

import decorator.beverages.Espresso;
import decorator.decorators.Mocha;
import decorator.decorators.Soy;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost());
    }
}
