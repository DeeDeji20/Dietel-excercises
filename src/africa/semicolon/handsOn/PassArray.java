package africa.semicolon.handsOn;

public class PassArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("Effect of passing referance to an entire array: %n" + "The values of the original array are: %n");

        for (int value : array) {
            System.out.printf("    %d", value);
        }
        modifiedArray(array);
        System.out.printf("%n%n The values of the modified arrays are: %n");
        for (int value : array) {
            System.out.printf("   %d", value);
        }

        System.out.printf("%n%nEffects of passing array element value:%n" +
                        "array[3] before modifyElement: %d%n", array[3]);
        modifiedElement(array[3]);
        System.out.printf("array[3] after modifying element %d%n", array[3]);
    }

    private static void modifiedElement(int element) {
        element*=2;
        System.out.printf("Value in element in modified element: %d%n", element);
    }

    private static void modifiedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}
