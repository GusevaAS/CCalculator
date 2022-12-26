public class CreditPaymentService {
    public double calculate(double loanAmount, double creditTerm, double interestRate) {
        double interestRateMonth = interestRate / 12 / 100;
        double coefficient = interestRateMonth * ((1 + interestRateMonth) ^ creditTerm) / (((1 + interestRateMonth) ^ creditTerm) - 1);
        double result = coefficient * loanAmount;
        return result;
    }
}
