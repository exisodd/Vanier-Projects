package project3;

public class Loan {

    private double loan;
    private double annualInterest;
    private int loanTerm;

    public Loan(double loan_amount, double annual_interest, int months) {
        try {
            setLoanAmount(loan_amount);
            setAnnualInterestRate(annual_interest);
            setLoanMonths(months);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    public double getLoanAmount() {
        return loan;
    }

    public void setLoanAmount(double lam) {
        if (lam < 0) {
            throw new IllegalArgumentException("Loan: setLoanAmount: the load amount must be non-negative");
        }
        loan = lam;
    }

    public double getAnnualInterestRate() {
        return annualInterest;
    }

    public void setAnnualInterestRate(double air) {
        if (air < 0 || air > 100) {
            throw new IllegalArgumentException("Loan: setAnnualInterestRate: " +
                    "the load amount must be between 0 and 100");
        }
        annualInterest = air;
    }

    public int getLoanMonths() {
        return loanTerm;
    }

    public void setLoanMonths(int months) {
        if (months < 0) {
            throw new IllegalArgumentException("Loan: setLoanMonths: the load amount must be non-negative");
        }
        loanTerm = months;
    }

    public double getMonthlyInterestRate() {
        return annualInterest / 1200;
    }

    public double getMonthlyPayment() {
        double dividend = getMonthlyInterestRate() * loan;
        double divisor = 1 - Math.pow(1 + getMonthlyInterestRate(), -loanTerm);
        return dividend / divisor;
    }

    public double getLoanCost() {
        double leftOver = loan;
        double paidInterest = 0;
        double currentInterest;
        for (int i = 0; i < loanTerm; i++) {
            currentInterest = getMonthlyInterestRate() * leftOver;
            leftOver -= getMonthlyPayment() - currentInterest;
            paidInterest += currentInterest;
        }
        return paidInterest;
    }

    @Override
    public String toString() {
        return "-".repeat(33) + "\n" +
               " ".repeat(11) + "Loan Report\n" +
               "-".repeat(33) + "\n" +
               String.format("%21s: $%.2f\n", "Loan Amount", loan) +
               String.format("%21s: %.2f%%\n", "Annual Interest rate", annualInterest) +
               String.format("%21s: %d\n", "Loan's term in months", loanTerm) +
               String.format("%21s: $%.2f\n", "Monthly Payment", getMonthlyPayment()) +
               String.format("%21s: $%.2f\n", "Total Interest Paid", getLoanCost()) +
               "-".repeat(33) + "\n";
    }

    public String amortize() {
        // Monthly payment text
        String monthPay = String.format("$%.2f", getMonthlyPayment());

        // Amortization header
        StringBuilder s = new StringBuilder(
                "-".repeat(39) + "\n" +
                " ".repeat(9) + "Amortization Schedule\n" +
                " ".repeat(12) + "Monthly Payment\n" +
                " ".repeat((39 - monthPay.length()) / 2) + monthPay + "\n" +
                "-".repeat(39) + "\n" +
                String.format("%-8s%-11s%-12s%-8s\n",
                              "Month", "Interest", "Principal", "Loan") +
                String.format("%-8s%-11s%-12s%-8s\n",
                              "", "Paid", "Paid", "Balance") +
                String.format("%-8s%-11s%-12s%-8s\n",
                              "-----", "--------", "---------", "--------") +
                String.format("%39.2f\n", loan)
        );

        // Monthly payments
        double leftOver = loan;
        double paidInterest = 0;
        double currentInterest;
        double principal;
        for (int i = 1; i <= loanTerm; i++) {
            currentInterest = getMonthlyInterestRate() * leftOver;
            principal = getMonthlyPayment() - currentInterest;
            leftOver -= principal;
            paidInterest += currentInterest;
            s.append(String.format("%5d%11.2f%12.2f%11.2f\n",
                     i, currentInterest, principal, Math.abs(leftOver)));
        }

        // Amortization footer
        s.append("-".repeat(39)).append("\n");
        s.append(String.format("%-8s%8.2f%12.2f\n", "Totals", paidInterest, loan));
        return s.toString();
    }
}
