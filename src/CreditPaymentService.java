public class CreditPaymentService {

    public int calculate(int loanAmount, int loanTerm, double interestRateAnnual){

        double interestRateMonthly = interestRateAnnual / 12 / 100;
        double monthlyPayment = loanAmount * interestRateMonthly * Math.pow((1 + interestRateMonthly), loanTerm) / (Math.pow((1 + interestRateMonthly), loanTerm) - 1);

        return (int) monthlyPayment;
    }
}
