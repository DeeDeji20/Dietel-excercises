package africa.semicolon.handsOn.practice.pc;

public class Case {
    private String model;
    private  String manufacturer;
    private int powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacturer, int powerSUpply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSUpply;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Powe button pressed");
    }
}
