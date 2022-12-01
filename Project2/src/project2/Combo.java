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
        // TODO Shallow copy or deep copy?
        dish = new Dish(combo.dish); // OR dish = combo.dish;
        beverage = new Beverage(combo.beverage); // OR beverage = combo.beverage;
    }

    public double calcComboPrice() {
        // TODO calculate price using calc price or using price variable??
        return 0.9 * (dish.getPrice() + beverage.getPrice());
    }

    public boolean equals(Combo combo) {
        // TODO overloaded???
        return dish.equals(combo.dish) && beverage.equals(combo.beverage);
    }

    @Override
    public String toString() {
        return "Dish:\n" + dish.toStringOffset() +
               "Beverage:\n" + beverage.toStringOffset();
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        // TODO shallow copy or deep copy?
        this.dish = dish;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        // TODO shallow copy or deep copy?
        this.beverage = beverage;
    }
}
