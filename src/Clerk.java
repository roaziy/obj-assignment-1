import java.util.UUID;
import java.util.Date;

public class Clerk {
    private String name;
    private Warehouse warehouse;

    public Clerk(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }

    public void receiveStock(Product product, int quantity) {
        warehouse.updateStock(product, quantity);
        warehouse
                .addTransaction(new Transaction(UUID.randomUUID().toString(), new Date(), product, quantity, "INCOME"));
    }

    public void releaseStock(Product product, int quantity) {
        if (warehouse.updateStock(product, -quantity)) {
            warehouse.addTransaction(
                    new Transaction(UUID.randomUUID().toString(), new Date(), product, quantity, "EXPENSE"));
        } else {
            System.out.println("Error: Not enough stock to release " + quantity + " units of " + product.getName());
        }
    }

    public void generateReport(Date startDate, Date endDate) {
        warehouse.generateInventoryReport(startDate, endDate);
    }
}