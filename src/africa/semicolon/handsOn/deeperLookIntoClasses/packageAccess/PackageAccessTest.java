package africa.semicolon.handsOn.deeperLookIntoClasses.packageAccess;

public class PackageAccessTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData();
        System.out.printf("Before instantiation: %n%s%n", packageData);

        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("After changing values: %n%s%n", packageData);
    }

}
class PackageData{
    int number;
    String string;

    public PackageData() {
        number =0;
        string ="Hi";
    }

    @Override
    public String toString() {
        return String.format("number: %d; string: %s%n", number, string);
    }
}
