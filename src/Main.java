import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Administration("Claus","123456-1234", 4));
        employeeList.add(new Instructor("Claus","123456-1234", 4));
        employeeList.add(new Administration("Claus","123456-1234", 4));
        employeeList.add(new Administration("Claus","123456-1234", 4));
        employeeList.add(new Instructor("Claus","123456-1234", 4));
        printFitnessEmployees(employeeList);
    }

    public static void printFitnessEmployees(List<Employee> list){
        System.out.println("FITNESS EMPLOYEES");
        System.out.println("\nNAME\tCPR\tHOURS\tSALARY\tVACATION");
        System.out.println("************************************************************************");

        for (Employee employee : list){
            System.out.println(employee);
        }

        System.out.println("\n"+"==========================================");
    }
}
