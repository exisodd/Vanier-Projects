package project2;

public class Tax {
    private double fedTax;
    private double proTax;
    private double totalTax;

    public Tax() {
        fedTax = 0;
        proTax = 0;
        totalTax = 0;
    }
    public Tax(double fedTax, double proTax, double totalTax) {
        try {
            setFedTax(fedTax);
            setProTax(proTax);
            setTotalTax(totalTax);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
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
        return String.format("%-10s: $%.2f\n", "Fed Tax", fedTax) +
               String.format("%-10s: $%.2f\n", "Pro Tax", proTax) +
               String.format("%-10s: $%.2f\n", "Total Tax", totalTax);
    }

    public double getFedTax() {
        return fedTax;
    }

    public void setFedTax(double fedTax) {
        if (fedTax < 0) {
            throw new IllegalArgumentException("Federal tax cannot be negative");
        }
        this.fedTax = fedTax;
    }

    public double getProTax() {
        return proTax;
    }

    public void setProTax(double proTax) {
        if (proTax < 0) {
            throw new IllegalArgumentException("Provincial tax cannot be negative");
        }
        this.proTax = proTax;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        if (totalTax < 0) {
            throw new IllegalArgumentException("Total tax cannot be negative");
        }
        this.totalTax = totalTax;
    }
}
