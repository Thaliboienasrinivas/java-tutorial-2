public class LoanCalculator {

    public double calculateLoan(double principal, double interestRate) {
        return principal * (1 + interestRate);
    }

    public double calculateLoan(double principal, double interestRate, int loanTenure) {
        double interest = principal * interestRate * loanTenure;
        return principal + interest;
    }

    public double calculateLoan(double principal, double interestRate, int loanTenure, double processingFees) {
        double interest = principal * interestRate * loanTenure;
        return principal + interest + processingFees;
    }

    public static void main(String[] args) {
        LoanCalculator calculator = new LoanCalculator();
        double personalLoanAmount = calculator.calculateLoan(10000, 0.05);
        System.out.println("Personal Loan Amount: " + personalLoanAmount);
        double homeLoanAmount = calculator.calculateLoan(500000, 0.08, 15);
        System.out.println("Home Loan Amount: " + homeLoanAmount);
        double carLoanAmount = calculator.calculateLoan(200000, 0.10, 5, 1000);
        System.out.println("Car Loan Amount: " + carLoanAmount);
    }
}
