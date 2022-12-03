package project2;

public class Tax {
    private double fedTax;
    private double proTax;
    private double totalTax;

    public Tax() {
        this(0, 0, 0);
    }
    public Tax(double fedTax, double proTax, double totalTax) {
        this.fedTax = fedTax;
        this.proTax = proTax;
        this.totalTax = totalTax;
    }

    public Tax(Tax tax) {
        this.fedTax = tax.fedTax;
        this.proTax = tax.proTax;
        this.totalTax = tax.totalTax;
    }

    public boolean equals(Tax tax) {
        return fedTax == tax.fedTax && proTax == tax.proTax && totalTax == tax.totalTax;
    }

    @Override
    public String toString() {
        return String.format("%-10s: $%.3f\n", "Fed Tax", fedTax) +
               String.format("%-10s: $%.3f\n", "Pro Tax", proTax) +
               String.format("%-10s: $%.3f\n", "Total Tax", totalTax);
    }

    public double getFedTax() {
        return fedTax;
    }

    public void setFedTax(double fedTax) {
        this.fedTax = fedTax;
    }

    public double getProTax() {
        return proTax;
    }

    public void setProTax(double proTax) {
        this.proTax = proTax;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }
}
