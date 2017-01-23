package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend coffee";
    }

    public double cost() {
        return 0.89;
    }
}
