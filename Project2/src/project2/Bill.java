package project2;

public class Bill {

    Combo combo;
    Customer customer;
    double originalPrice;
    double discountedPrice;
    Tax tax;
    double finalPrice;

    public Bill() {
        combo = new Combo();
        customer = new Customer();
        tax = new Tax();
        originalPrice = 0;
        discountedPrice = 0;
        finalPrice = 0;
    }

    public Bill(Dish dish, Beverage beverage, Customer customer) {
        this.combo = new Combo(dish, beverage);
        this.customer = customer;
        this.originalPrice = this.combo.calcComboPrice();
        this.discountedPrice = calcPriceWithDiscount();
        this.tax = calcTax();
        this.finalPrice = calcFinalPrice();
    }

    public Bill(Bill bill) {
        // TODO Deep copy or shallow copy???
        this.combo = bill.combo; // OR this.combo = new Combo(bill.combo);
        this.customer = bill.customer; // OR this.customer = new Combo(bill.customer);
        this.originalPrice = bill.originalPrice;
        this.discountedPrice = bill.discountedPrice;
        this.tax = bill.tax; // OR this.tax = new Combo(bill.tax);
        this.finalPrice = bill.finalPrice;
    }

    public double calcPriceWithDiscount() {
        return switch (customer.getVipLevel()) {
            case 0 -> originalPrice;
            case 1 -> 0.95 * originalPrice;
            case 2 -> 0.9 * originalPrice;
            case 3 -> 0.85 * originalPrice;
            default -> 0;
        };
    }

    public Tax calcTax() {
        // TODO Is tax applied on originalPrice or finalPrice?
        double fedTax = 0.05;
        double proTax = 0.1;
        double totalTax = fedTax + proTax;
        return new Tax(fedTax * originalPrice, proTax * originalPrice,
                totalTax * originalPrice);
    }

    public double calcFinalPrice() {
        return discountedPrice + tax.getTotalTax();
    }

    public void updatePoints() {
        int costPer = 10;
        customer.setPoint(customer.getPoint() + (int) Math.floor(finalPrice / costPer));
    }

    public boolean equals(Bill bill) {
        // TODO overloaded?
        return combo.equals(bill.combo) && customer.equals(bill.customer) &&
               originalPrice == bill.originalPrice &&
               discountedPrice == bill.discountedPrice && tax.equals(bill.tax) &&
               finalPrice == bill.finalPrice;
    }

    @Override
    public String toString() {
        return combo.toString() +
               String.format("%40s\n", " ").replace(' ', '*') +
               String.format("%-20s: %s - L%d\n", "Customer",
                             customer.getCustomerId(), customer.getVipLevel()) +
               String.format("%-20s: $%.2f\n", "Original Price", originalPrice) +
               String.format("%-20s: $%.2f\n", "Discounted Price", discountedPrice) +
               String.format("%-20s: $%.2f\n", "Fed Tax", tax.getFedTax()) +
               String.format("%-20s: $%.2f\n", "Pro Tax", tax.getProTax()) +
               String.format("%-20s: $%.2f\n", "Total Tax", tax.getTotalTax()) +
               String.format("%40s\n", " ").replace(' ', '-') +
               String.format("%-20s: $%.2f\n", "Final Price Tax", finalPrice);
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
