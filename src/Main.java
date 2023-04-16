public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        int loanTerm = 12;
        double interestRateAnnual = 9.99;

        int monthlyPayment = service.calculate(loanAmount, loanTerm, interestRateAnnual);

        System.out.println("Ежемесячный платеж при сумме кредите 1 мил. на 1 год при ставке 9.99%");
        System.out.println(monthlyPayment);
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредите 1 мил. на 2 года при ставке 9.99%");
        System.out.println(service.calculate(1_000_000, 24, 9.99));
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредите 1 мил. на 3 года при ставке 9.99%");
        System.out.println(service.calculate(1_000_000, 36, 9.99));
    }
}
