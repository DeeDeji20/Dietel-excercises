package africa.semicolon.chapterFour.gasMileage;

public class GasMileage {
    private int milesDriven;
    private int gallons;
    double total=0;
//    private int combinedMilesPerGallon;

    public GasMileage(int milesDriven, int gallons){
        this.milesDriven = milesDriven;
        this.gallons = gallons;
    }

    public void setMilesDriven(int milesDriven){
        this.milesDriven = milesDriven;
    }

    public int getMilesDriven(){
        return milesDriven;

    }

    public void setGallons(int gallons){
        this.gallons = gallons;
    }

    public int getGallons(){
        return gallons;
    }

    public double milesPerGallon(){
        double milesPerGallon;
        milesPerGallon = (double) getMilesDriven() / getGallons();
        return milesPerGallon;
    }

    public double combinedMilesPerGallon(){
        return total += milesPerGallon();
    }

}
