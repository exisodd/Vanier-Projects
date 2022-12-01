package project2;

public class Combo {

    private Dish dish;
    private Beverage beverage;

    public Combo() {
        dish = new Dish();
        beverage = new Beverage();
    }
    public Combo(Dish dish, Beverage beverage) {
        this.dish = dish;
        this.beverage = beverage;
    }

    public Combo(Combo combo) {
        // TODO deep copy
    }

    public double calcComboPrice() {
        // TODO calculate price using calc price or using price variable??
        return 0.9 * (dish.getPrice() + beverage.calcPrice());
    }

    public boolean equals(Combo combo) {
        // TODO overloaded???
        return dish.equals(combo.dish) && beverage.equals(combo.beverage);
    }

    @Override
    public String toString() {
        return "Dish:\n" +
                String.format("%s%s", " ", dish.toString()) +
                "Beverage:\n" +
                String.format("%s%s", " ", beverage.toString());
    }
}
