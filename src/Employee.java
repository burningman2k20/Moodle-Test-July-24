public class Employee {
    private String firstName = "";
    private String lastName = "";
    private double monthlySalary = 0;

    public Employee(String _firstName, String _lastName, double _salary){
        this.setFirstName(_firstName);
        this.setLastName(_lastName);
        this.setSalary(_salary);
    }

    void setFirstName(String _firstName){
        this.firstName = _firstName;
    }

    String getFirstName(){
        return this.firstName;
    }

    void setLastName(String _lastName){
        this.lastName = _lastName;
    }

    String getLastName(){
        return this.lastName;
    }

    void setSalary(double _salary){
        if (_salary < 0) _salary = 0;
        this.monthlySalary = ((_salary * 8) * 5) * 4;
    }

    double getSalary(){
        return this.monthlySalary;
    }

    double calculateYearlySalary(){
        return (this.getSalary() * 12);
    }

    double giveRaise( int _percent){
        double percent = 0.10;
                //_percent / 100;
        //System.out.printf("%f\n",percent);
        return (this.getSalary() * percent) + this.getSalary();
    }

    double calculateRaise(){
        return (this.giveRaise(10) * 12);
    }

    void displayEmployee(){
        System.out.printf("Employee Name: %.15s %.15s\n",this.getFirstName(), this.getLastName());
        //System.out.printf("Employee Monthly Salary %6.2f\n", getSalary());
        System.out.printf("Employee Yearly Salary %6.2f\n", this.calculateYearlySalary());
        System.out.printf("Gave %.15s a %%10 raise, and now makes %6.2f yearly\n", this.getFirstName(), this.calculateRaise());
    }
}
