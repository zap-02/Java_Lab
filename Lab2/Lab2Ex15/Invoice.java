package Lab2Ex15;

import java.util.ArrayList;

public class Invoice {
        private static class Item { // Класс Item вложен в класс Invoice
            String description;
            int quantity;
            double unitPrice;
            double price() { return quantity * unitPrice; }
            void printItem(){
                System.out.printf("%20s %20d %20f %20f\n",description, quantity,unitPrice, price());
            }
        }
        private ArrayList<Item> items = new ArrayList<>() ;
    public void addltem(String description, int quantity, double unitPrice) {
        Item newltem = new Item();
        newltem.description = description;
        newltem.quantity = quantity;
        newltem.unitPrice = unitPrice;
        items.add(newltem);
    }
    public void printInvoice(){
        System.out.printf("%20s %20s %20s %20s\n", "Description", "Quantity", "Unit Price", "Total");
        for(Item item: items){
            item.printItem();
        }
    }
}
