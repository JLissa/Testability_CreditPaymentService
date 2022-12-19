public class CreditPaymentService {
    public double calculate(int s, double i, int n) {
//        double ps = i / n / 100;
        double r = i / 12 / 100;
        double l = 1 + r;
        double m = Math.pow(l, -n);
        double p = s * (r / (1 - m ));
//        double p = s * ps * m / (m - 1);
        return p;
    }
}

//A = P * (r / (1 - (1 + r)^(-n)))

// - ежемесячный платеж
//         P - сумма кредита (общая сумма займа)
//         r - ежемесячная процентная ставка (разделенная на 12 месяцев)
//         n - количество месяцев в периоде кредита
//         Например, для кредита в 100000 рублей с ежемесячной процентной ставкой 10% на 36 месяцев, ежемесячный платеж составит:
//


//ЕП = С × ПС × (1 + ПС)ⁿ / ((1 + ПС)ⁿ – 1), где
//        ЕП – размер ежемесячного платежа,
//        С – сумма займа,
//        ПС – месячная ставка по займу в долях от единицы, которая вычисляется по формуле: годовая ставка / 12 мес. / 100%,
//        n – срок кредита (в месяцах).