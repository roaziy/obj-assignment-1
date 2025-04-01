public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Warehouse warehouse = new Warehouse("W001", "Ulaanbaatar");
        Clerk clerk1 = new Clerk("Bold", warehouse);
        Clerk clerk2 = new Clerk("Dorj", warehouse);
        warehouse.addClerk(clerk1);
        warehouse.addClerk(clerk2);

        Product product = new Product("P001", "MacBook Pro M1 Pro", 50);
        clerk1.receiveStock(product, 30);
        clerk2.releaseStock(product, 10);

        System.out.println("Warehouse System Running");
    }
}