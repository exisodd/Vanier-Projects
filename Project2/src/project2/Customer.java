package project2;

public class Customer {

    private String customerId;
    private String name;
    private int vipLevel;
    private int point;
    private static int nextId = 1;

    public Customer() {
        customerId = generateId();
        name = "";
        vipLevel = 0;
        point = 0;
    }

    public Customer(String name, int vipLevel, int point) {
        this.customerId = generateId();
        this.name = name;
        this.vipLevel = vipLevel;
        this.point = point;
    }

    public Customer(Customer customer) {
        this.customerId = generateId();
        this.name = customer.name;
        this.vipLevel = customer.vipLevel;
        this.point = customer.point;
    }
    public static String generateId() {
        return String.format(String.format("C%03d", nextId++));
    }

    public boolean updateVip() {
        switch (vipLevel) {
            case 0:
                if (point < 50) {
                    return false;
                } else {
                    point -= 50;
                    vipLevel++;
                    return true;
                }
            case 1:
                if (point < 80) {
                    return false;
                } else {
                    point -= 80;
                    vipLevel++;
                    return true;
                }
            case 2:
                if (point < 100) {
                    return false;
                } else {
                    point -= 100;
                    vipLevel++;
                    return true;
                }
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%-17s: %s\n", "Customer ID", customerId) +
               String.format("%-17s: %s\n", "Customer Name", name) +
               String.format("%-17s: %d\n", "Vip Level", vipLevel) +
               String.format("%-17s: %d\n", "Points", point);
    }

    public boolean equals(Customer customer) {
        // TODO overloaded?
        return name.equals(customer.name) && vipLevel == customer.vipLevel &&
               point == customer.point;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
