public class Shiopan extends Bakery {

    private int piece;
    private boolean premium;

    public Shiopan(int piece, boolean premium, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;
        this.premium = premium;
    }

    public boolean isPackingBox() {
        return piece >= 6;
    }

    public int getBoxNumber() {
        return isPackingBox() ? piece / 6 : 0;
    }

    public int getBagNumber() {
        return piece % 6;
    }

    @Override
    public int getPackingCost() {
        return isPackingBox() ? getBoxNumber() * super.getPackingCost() : 0;
    }

    @Override
    public double calculateTotalPrice() {
        double price = piece * getUnitPrice();

        if (premium) {
            price *= 1.2;
        }

        return price + getPackingCost() + (getBagNumber() * 0.5);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nShiopan (" + getFlavor() + ")"
                + (premium ? " [Premium]" : "")
                + "\nAmount: " + piece
                + "\nPacking: "
                + (isPackingBox() ? getBoxNumber() + " Box " : "")
                + getBagNumber() + " Bag"
                + "\nTotal price = " + calculateTotalPrice();
    }
}
