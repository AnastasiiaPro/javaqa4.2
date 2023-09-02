public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double loanSum = 1_000_000;
        double Percent = 9.99;
        int totalMonths = 36;

        int annuityPayment = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платёж: " + annuityPayment + " руб.");

    }
}