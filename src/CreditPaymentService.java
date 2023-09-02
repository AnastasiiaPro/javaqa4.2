public class CreditPaymentService {
    public int calculate(int loanSum, double Percent, int totalMonths) {

        double a = 1 + (Percent / 100 / 12);
        double b = Math.pow(a, totalMonths);

        int annuityPayment = (int) (loanSum * (Percent / 100 / 12) * b / (b - 1));
        return annuityPayment;
    }
}