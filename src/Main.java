public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Ваш ежемесячный платеж: " + (int)monthlyPayment);

        monthlyPayment = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Ваш ежемесячный платеж: " + (int)monthlyPayment);

        monthlyPayment = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ваш ежемесячный платеж: " + (int)monthlyPayment);
    }
}
