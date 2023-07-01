public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000;
        double monthlyInterestRate = 0.008325;
        int numberOfMonth = 24;
        float monthlyPaymentAmount = service.calculate(credit, monthlyInterestRate, numberOfMonth);

        System.out.println(monthlyPaymentAmount);


    }
}
