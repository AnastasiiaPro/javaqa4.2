public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double loanSum = 1_000_000;
        double percent = 9.99;
        int totalMonths = 12;

        int annuityPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Ежемесячный платёж: " + annuityPayment + " руб.");

        annuityPayment = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Ежемесячный платёж: " + annuityPayment + " руб.");

        annuityPayment = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платёж: " + annuityPayment + " руб.");
    }
}