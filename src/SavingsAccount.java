public class SavingsAccount {
    static double annualInterestRate = 0.0;
    private double savingsBalance = 0;

    public SavingsAccount(double _balance, double _rate){
        this.setSavingsBalance(_balance);
        this.modifyInterestRate(_rate);
    }

    void setSavingsBalance(double _balance){
        this.savingsBalance = _balance;
    }

    double getSavingsBalance(){
        return this.savingsBalance;
    }

    double calculateMonthlyInterest(){
        double _interest = ((this.getSavingsBalance() * this.annualInterestRate) / 12) + this.getSavingsBalance();
        this.setSavingsBalance(_interest);
        return _interest;
    }

    void modifyInterestRate(double _rate){
        this.annualInterestRate = _rate;
    }
}
