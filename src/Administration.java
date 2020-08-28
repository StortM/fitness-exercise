public class Administration extends Employee{
    private int vacation;

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public Administration(String name, String cpr, int hours) {
        super(name, cpr, hours);
        super.setSalary(23000);
        this.vacation = 5;                                                  
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + vacation;
    }

}
