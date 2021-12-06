package africa.semicolon.chapterThree.invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantityPurchased, double pricePerItem){

        this.partNumber = partNumber;
        this.partDescription= partDescription;
        this.quantityPurchased = quantityPurchased;
        if(pricePerItem > 0.0) this.pricePerItem = pricePerItem;
    }


    public String getPartNumber(){
        return partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public int getQuantityPurchased(){
        return quantityPurchased;
    }
    public void setQuantityPurchased(int quantityPurchased){
        if(quantityPurchased < 0) this.quantityPurchased = 0;
        else this.quantityPurchased = quantityPurchased;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem){
        if(pricePerItem < 0.0) this.pricePerItem = 0.0;
        else this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        double amount;
        return amount = quantityPurchased * pricePerItem;
    }
}
