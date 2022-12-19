public class CreditPaymentService {
    public double calculate(int s, double i, int n) {
        double r = i / 12 / 100;
        double l = 1 + r;
        double m = Math.pow(l, -n);
        return s * (r / (1 - m ));
    }
}
