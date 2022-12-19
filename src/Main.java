public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        double percent = 9.99;
        int periodInMonths = 12;
        double monthlyPayment = service.calculate(creditSum, percent, periodInMonths);
        System.out.println("Ваш ежемесячный платеж: " + (int)monthlyPayment);
    }
}

