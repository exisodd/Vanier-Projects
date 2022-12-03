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
        // TODO Shallow copy or deep copy? If Deep Copy -> equals returns false because not same ID?
        dish = new Dish(combo.dish); // OR dish = combo.dish;
        beverage = new Beverage(combo.beverage); // OR beverage = combo.beverage;
    }

    public double calcComboPrice() {
        return 0.9 * (dish.calcDishPrice() + beverage.calcPrice());
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
        this.dish = dish;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
