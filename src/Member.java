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

    public String getMemberType(){
        if (isBasic){
            return "Basic";
        }
        else {
            return "Full";
        }
    }

    public int MonthlyFee(){
        if (isBasic){
            return 199;
        }
        else {
            return 299;
        }
    }

}
