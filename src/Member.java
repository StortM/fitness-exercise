import java.util.List;

public class Member extends Person {
    private boolean isBasic;

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public Member() {
    }

    public String getMemberType(){
        if (isBasic){
            return "Basic";
        }
        else {
            return "Full";
        }
    }

    public int monthlyFee(){
        if (isBasic){
            return 199;
        }
        else {
            return 299;
        }
    }

    public void printFitnessMembers(List<Member> memberList){
        System.out.println("FITNESS MEMBERS");
        System.out.println("\nNAME\tCPR\t\t\tMEMBER TYPE\tFEE");
        System.out.println("************************************************");

        for (Member member : memberList){
            System.out.println(member);
        }

        System.out.println("\n"+"================================================");
    }

    @Override
    public String toString() {
        return super.getName() + "\t" + super.getCpr() + "\t\t" + getMemberType() + "\t" + monthlyFee();
    }

}
