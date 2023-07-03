public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        int credit = 1_000_000;
        double annualInterestRate = 0.0999;
        double monthlyInterestRate = annualInterestRate / 12;
        int numberOfMonth = 12;
        float monthlyPaymentAmount = service.calculate(credit, monthlyInterestRate, numberOfMonth, annualInterestRate);
        System.out.println(monthlyPaymentAmount);


        credit = 1_000_000;
        annualInterestRate = 0.0999;
        monthlyInterestRate = annualInterestRate / 12;
        numberOfMonth = 24;
        monthlyPaymentAmount = service.calculate(credit, monthlyInterestRate, numberOfMonth, annualInterestRate);
        System.out.println(monthlyPaymentAmount);


        credit = 1_000_000;
        annualInterestRate = 0.0999;
        monthlyInterestRate = annualInterestRate / 12;
        numberOfMonth = 36;
        monthlyPaymentAmount = service.calculate(credit, monthlyInterestRate, numberOfMonth, annualInterestRate);
        System.out.println(monthlyPaymentAmount);
    }

}
