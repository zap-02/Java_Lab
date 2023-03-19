package Lab2Ex15;

public class Lab2Ex15 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addltem("item1", 223, 554.3);
        invoice.addltem("item2", 452, 788.56);
        invoice.addltem("item3", 26, 57.25);
        invoice.addltem("item4", 287, 590.5757);
        invoice.addltem("item5", 902, 354.6452);
        invoice.addltem("item6", 294, 658.3321);
        invoice.addltem("item7", 320, 536.6872);
        invoice.addltem("item8", 265, 246.02);
        invoice.addltem("item9", 211, 217.784);
        invoice.printInvoice();
    }
}
