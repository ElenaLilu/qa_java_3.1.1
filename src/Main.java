public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000;
        double annualInterestRate = 0.0999;
        double monthlyInterestRate = annualInterestRate / 12;
        int numberOfMonth = 12;
        float monthlyPaymentAmount = service.calculate(credit, monthlyInterestRate, numberOfMonth);

        System.out.println(monthlyPaymentAmount);
    }

}
