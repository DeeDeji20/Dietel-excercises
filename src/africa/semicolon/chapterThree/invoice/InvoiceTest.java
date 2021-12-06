package africa.semicolon.chapterThree.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice(" ", "First product", 0, 40.00);

        System.out.printf("Initial part number: %s%n", myInvoice.getPartNumber());

        System.out.printf("Initial description: %s%n", myInvoice.getPartDescription());

        System.out.printf("Initial quantity purchased: %d%n", myInvoice.getQuantityPurchased());

        System.out.printf("Initial price per item: %.2f%n", myInvoice.getPricePerItem());

        System.out.printf("Initial invoice amount: %.2f%n", myInvoice.getInvoiceAmount());


        myInvoice.setPartNumber("02");
        myInvoice.setPartDescription("Hey, My first purchsae");
        myInvoice.setQuantityPurchased(3);
        myInvoice.setPricePerItem(100);

        System.out.println("=".repeat(35));

        System.out.printf("New part number: %s%n", myInvoice.getPartNumber());

        System.out.printf("New description: %s%n", myInvoice.getPartDescription());

        System.out.printf("New quantity purchased: %d%n", myInvoice.getQuantityPurchased());

        System.out.printf("New price per item: %.2f%n", myInvoice.getPricePerItem());

        System.out.printf("New invoice amount: %.2f%n", myInvoice.getInvoiceAmount());
    }
}
