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
        this.beverageId = generateId();
        this.beverageName = beverageName;
        this.price = price;
        this.volume = volume;
    }

    public Beverage(Beverage beverage) {
        this.beverageId = generateId();
        this.beverageName = beverage.beverageName;
        this.price = beverage.price;
        this.volume = beverage.volume;
    }

    public static String generateId() {
        return String.format(String.format("B%03d", nextId++));
    }

    public double calcPrice() {
        if (volume > 500) {
            return price;
        } else {
            return price * 0.6;
        }
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
               String.format("%-17s: %d\n", "Beverage Volume", volume);
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
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static void main(String[] args) {
        Beverage myBev = new Beverage("Diet Coke", 2, 500);
        Beverage myBev2 = new Beverage("Diet Coke", 2, 500);
        System.out.println(myBev2.toString());
        System.out.println(myBev.toString());
    }
}
