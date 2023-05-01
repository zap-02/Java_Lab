import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(otherObject.getClass() == Item.class){
            return super.equals(otherObject);
        } else {
            if(!super.equals(otherObject)) return false;
            DiscountedItem other = (DiscountedItem) otherObject;
            return Objects.equals(discount, other.discount);
        }
    }

    public static void main(String[] args) {
        DiscountedItem item1 = new DiscountedItem("Item", 100.0, 0.25);
        DiscountedItem item2 = new DiscountedItem("Item", 100.0, 0.05);
        Item item3 = new Item("Item", 100.0);
        Item item4 = new Item("Item", 100.0);

        System.out.println("item1.equals(item2) = " + item1.equals(item2)); // false
        System.out.println("item2.equals(item1) = " + item2.equals(item1)); // false
        System.out.println("item1.equals(item3) = " + item1.equals(item3));
        System.out.println("item3.equals(item1) = " + item3.equals(item1));
        System.out.println("item2.equals(item3) = " + item2.equals(item3));
        System.out.println("item3.equals(item2) = " + item3.equals(item2));
    }
}