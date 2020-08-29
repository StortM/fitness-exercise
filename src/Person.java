import java.util.List;

public class Person {
    private String name;
    private String cpr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }
    public Person() {
    }

    public void printFitnessPersons(List<Person> personList){
        System.out.println("FITNESS AND EMPLOYEE MEMBERS");
        System.out.println("\nNAME\tCPR");
        System.out.println("************************************************");

        for (Person person : personList){
            System.out.println(person.getName() + "\t" + person.getCpr());
        }

        System.out.println("\n"+"================================================");
    }

    @Override
    public String toString() {
        return name + "\t" + cpr;
    }
}
