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
        dish = combo.dish;
        beverage = combo.beverage;
    }

    public double calcComboPrice() {
        return 0.9 * (dish.calcDishPrice() + beverage.calcPrice());
    }

    public boolean equals(Combo combo) {
        return dish.equals(combo.dish) && beverage.equals(combo.beverage);
    }

    @Override
    public String toString() {
        // Add offset dish
        StringBuilder str = new StringBuilder("Dish:\n");
        for (String s: dish.toString().split("\n")) {
            str.append("       ").append(s).append("\n");
        }

        // Add offset beverage
        str.append("\nBeverage:\n");
        for (String s: beverage.toString().split("\n")) {
            str.append("       ").append(s).append("\n");
        }

        return str.toString();
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
