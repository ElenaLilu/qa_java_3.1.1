public class CreditPaymentService {

    public int calculate(int credit, int numberOfMonth, double annualInterestRate) {


        double monthlyPaymentAmount = credit * (((annualInterestRate / 12) * (Math.pow((1 + (annualInterestRate / 12)), numberOfMonth)) / (Math.pow((1 + (annualInterestRate / 12)), numberOfMonth) - 1)));
        return (int) monthlyPaymentAmount;


    }
}
