package chapterThree;

public class PetrolPurchase {
    private String location;
    private String type;
    private int quantity;
    private double price;
    private double percentageDiscount;

    public PetrolPurchase(String location, String type, int quantity, double price, double percentageDiscount) {
        this.location = location;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount(){
        return (quantity*price)-percentageDiscount;
    }
}
