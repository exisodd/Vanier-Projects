package project2;

public class Dish {

    private String dishId;
    private String dishName;
    private char size;
    private double price;
    private boolean spicy;
    private static int nextId;

    public Dish() {
        dishName = generateId();
        dishName = "";
        size = 'x';
        price = 0;
        spicy = false;
    }

    public Dish(String dishName, char size, double price, boolean spicy) {
        this.dishName = generateId();
        this.dishName = dishName;
        this.size = size;
        this.price = price;
        this.spicy = spicy;
    }

    public static String generateId() {
        return String.format(String.format("D%03d", nextId++));
    }
}
