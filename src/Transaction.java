import java.util.Date;

public class Transaction {
    private String transactionId;
    private Date date;
    private Product product;
    private int quantity;
    private String type; // "ОРЛОГО" эсвэл "ЗАРДАЛ"

    public Transaction(String transactionId, Date date, Product product, int quantity, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.product = product;
        this.quantity = quantity;
        this.type = type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
}