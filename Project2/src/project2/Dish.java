package project2;

public class Dish {

    private String dishId;
    private String dishName;
    private char size;
    private double price;
    private boolean spicy;
    private static int nextId = 1;

    public Dish() {
        dishId = generateId();
        dishName = "";
        size = 'X';
        price = 0;
        spicy = false;
    }

    public Dish(String dishName, char size, double price, boolean spicy) {
        this.dishId = generateId();
        this.dishName = dishName;
        this.size = size;
        this.price = price;
        this.spicy = spicy;
    }

    public Dish(Dish dish) {
        this.dishId = generateId();
        this.dishName = dish.dishName;
        this.size = dish.size;
        this.price = dish.price;
        this.spicy = dish.spicy;
    }
    public static String generateId() {
        return String.format(String.format("D%03d", nextId++));
    }

    public double calcDishPrice() {
        return switch (size) {
            case 'X', 'x' -> 1.2 * price;
            case 'L', 'l' -> price;
            case 'M', 'm' -> 0.6 * price;
            case 'S', 's' -> 0.4 * price;
            default -> 0;
        };
    }

    public boolean equals(Dish dish) {
        return dishName.equals(dish.dishName) && size == dish.size &&
               price == dish.price && spicy == dish.spicy;
    }

    @Override
    public String toString() {
        return String.format("%-17s: %s\n", "Dish ID", dishId) +
               String.format("%-17s: %s\n", "Dish Name", dishName) +
               String.format("%-17s: %s\n", "Dish Size", size) +
               String.format("%-17s: $%.2f\n", "Dish Price", price) +
               String.format("%-17s: %s\n", "Spicy", spicy ? "Spicy" : "Not Spicy");
    }

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }
}
