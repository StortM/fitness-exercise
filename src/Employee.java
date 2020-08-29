import java.util.List;

public class Employee extends Person{
    private int hours;
    private int salary;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public Employee() {
    }

    public void printFitnessEmployees(List<Employee> employeeList){
        System.out.println("FITNESS EMPLOYEES");
        System.out.println("\nNAME\tCPR\t\t\tHOURS\tSALARY\tVACATION");
        System.out.println("************************************************");

        for (Employee employee : employeeList){
            System.out.println(employee);
        }

        System.out.println("\n"+"================================================");
    }

    @Override
    public String toString() {
        return super.getName() + "\t" + super.getCpr() + "\t\t" + hours + "\t" + salary;
    }
}
