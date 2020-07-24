public class SavingsAccountTest {
    public static void main (String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000,0.04);
        SavingsAccount saver2 = new SavingsAccount(3000,0.04);

        System.out.printf("Saver #1 Balance %.2f -> Interest Rate %.2f -> Balance with interest %.2f\n", saver1.getSavingsBalance(), saver1.annualInterestRate, saver1.calculateMonthlyInterest());
        System.out.printf("Saver #2 Balance %.2f -> Interest Rate %.2f -> Balance with interest %.2f\n\n", saver2.getSavingsBalance(), saver2.annualInterestRate,  saver2.calculateMonthlyInterest());

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);
        System.out.printf("Saver #1 Balance %.2f -> Interest Rate %.2f -> Balance with interest %.2f\n", saver1.getSavingsBalance(), saver1.annualInterestRate, saver1.calculateMonthlyInterest());
        System.out.printf("Saver #2 Balance %.2f -> Interest Rate %.2f -> Balance with interest %.2f\n\n", saver2.getSavingsBalance(), saver2.annualInterestRate, saver2.calculateMonthlyInterest());
    }
}
