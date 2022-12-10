package project2;

public class Beverage {

    private String beverageId;
    private String beverageName;
    private double price;
    private int volume;
    private static int nextId = 1;

    public Beverage() {
        beverageId = generateId();
        beverageName = "";
        price = 0;
        volume = 0;
    }

    public Beverage(String beverageName, double price, int volume) {
        try {
            setPrice(price);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        this.beverageId = generateId();
        this.beverageName = beverageName;
        this.volume = volume;
    }

    public Beverage(Beverage beverage) {
        this.beverageId = generateId();
        this.beverageName = beverage.beverageName;
        this.price = beverage.price;
        this.volume = beverage.volume;
    }

    private static String generateId() {
        return String.format("B%03d", nextId++);
    }

    public double calcPrice() {
        return (volume > 500) ? price : 0.6 * price;
    }

    public boolean equals(Beverage beverage) {
        return volume == beverage.volume && price == beverage.price &&
               beverageName.equals(beverage.beverageName);
    }

    @Override
    public String toString() {
        return String.format("%-17s: %s\n", "Beverage ID", beverageId) +
               String.format("%-17s: %s\n", "Beverage Name", beverageName) +
               String.format("%-17s: $%.2f\n", "Beverage Price", price) +
               String.format("%-17s: %d\n", "Beverage", volume);
    }

    public String getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(String beverageId) {
        this.beverageId = beverageId;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
