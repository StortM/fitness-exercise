import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Making employee arrayList and testing print method
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Administration("Claus","123456-1234", 37));
        employeeList.add(new Instructor("Tove","123456-1234", 20));
        employeeList.add(new Administration("Anna","123456-1234", 37));
        employeeList.add(new Administration("Henning","123456-1234", 15));

        //calling employee method from class
        Employee employee = new Employee();
        employee.printFitnessEmployees(employeeList);

        //Making member arrayList and testing print method
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("Morten","123456-1234",false));
        memberList.add(new Member("Martin","123456-1234",true));
        memberList.add(new Member("Martina","123456-1234",false));
        memberList.add(new Member("Marcel","123456-1234",true));

        Member member = new Member();
        member.printFitnessMembers(memberList);

        //Making employee and member arrayList and testing print method
        List<Person> personList = new ArrayList<>();
        personList.addAll(employeeList);
        personList.addAll(memberList);

        Person person = new Person();
        person.printFitnessPersons(personList);
    }
}
