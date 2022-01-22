package africa.semicolon.handsOn.practice.pc;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(20, 20, 5);
        Case theCase = new Case("220B", "Dell", 240, dimension);

        Monitor theMonitor = new Monitor("27inch Boast", "Acer", 27, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherBoard);
        thePC.getMonitor().drawPixelArt(1500, 1200, "red");
        thePC.getMotherBoard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

    }
}
