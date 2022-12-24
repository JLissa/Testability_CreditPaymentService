public class CreditPaymentService {
    public double calculate(int sum, double percent, int month) {
        double percR = percent / 12 / 100;
        double percL = 1 + percR;
        double monthM = Math.pow(percL, -month);
        return sum * (percR / (1 - monthM));
    }
}
