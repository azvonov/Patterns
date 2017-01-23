package decorator.decorators;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", SOY";
    }

    public double cost() {
        return beverage.cost() + 1.03;
    }
}
