package africa.semicolon.handsOn;

public enum States {

    SS(new String[]{"Edo", "Aqua-ibom"}),
    SE(new String[]{"Edo", "Aqua-ibom"}),
    SW(new String[]{"Edo", "Aqua-ibom"}),
    N_C(new String[]{"Edo", "Aqua-ibom"});

    private final String[] states;
    States(String[] states){
        this.states = states;
    }
}
