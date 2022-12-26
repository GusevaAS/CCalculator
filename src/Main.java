public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double loanAmount = 1_000_000;
        double interestRate = 9.99;
        double creditTerm = 12;
        double payment = service.calculate(loanAmount, creditTerm, interestRate);

        System.out.println(payment);
    }
}