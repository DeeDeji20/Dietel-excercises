package africa.semicolon.handsOn.practice.composition;

public class Cohort {
    private String name;
    private Native[] natives = new Native[30];

    public Cohort(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Native[] getNatives() {
        return natives;
    }

    public void setNatives(Native[] natives) {
        this.natives = natives;
    }

    public static void main(String[] args) {
        Cohort cohortOne = new Cohort("Phoenix");
        Native newNative = new Native();
        cohortOne.addNativeToCohort(newNative);
    }

    public void addNativeToCohort(Native native1){
        for (int i = 0; i < natives.length; i++) {
            if(natives[i]==null){
                natives[i]= native1;
            }
        }
    }
}
