public class CreditPaymentService {
    public int calculate(int loanSum, double percent, int totalMonths) {

        double a = 1 + (percent / 100 / 12);
        double b = Math.pow(a, totalMonths);

        int annuityPayment = (int) ((loanSum * percent / 100 / 12) * b / (b - 1));
        return annuityPayment;
    }
}