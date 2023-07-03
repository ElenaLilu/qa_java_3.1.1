public class CreditPaymentService {

    public int calculate(int credit, double monthlyInterestRate, int numberOfMonth, double annualInterestRate) {


        double monthlyPaymentAmount = credit * ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfMonth)) / (Math.pow((1 + monthlyInterestRate), numberOfMonth) - 1)));
        return (int) monthlyPaymentAmount;


    }
}
