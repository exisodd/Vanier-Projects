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

}
