import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Warehouse {
    private String warehouseId;
    private String location;
    private List<Product> inventory;
    private List<Transaction> transactions;
    private List<Clerk> clerks;

    public Warehouse(String warehouseId, String location) {
        this.warehouseId = warehouseId;
        this.location = location;
        this.inventory = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.clerks = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public boolean updateStock(Product product, int quantity) {
        for (Product p : inventory) {
            if (p.getProductId().equals(product.getProductId())) {
                if (p.getQuantity() + quantity < 0) {
                    System.out.println("Error: Insufficient stock for " + product.getName());
                    return false;
                }
                p.setQuantity(p.getQuantity() + quantity);
                return true;
            }
        }
        if (quantity > 0) {
            inventory.add(new Product(product.getProductId(), product.getName(), quantity));
            return true;
        }
        return false;
    }

    public void generateInventoryReport(Date startDate, Date endDate) {
        System.out.println("Inventory Report from " + startDate + " to " + endDate);
        for (Transaction t : transactions) {
            if (t.getDate().after(startDate) && t.getDate().before(endDate)) {
                System.out.println(t.getType() + " - " + t.getProduct().getName() + " - " + t.getQuantity());
            }
        }
    }

    public void addClerk(Clerk clerk) {
        clerks.add(clerk);
    }
}