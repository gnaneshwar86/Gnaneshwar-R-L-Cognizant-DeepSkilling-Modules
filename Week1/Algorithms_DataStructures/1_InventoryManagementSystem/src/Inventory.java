import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {

        if (products.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists.");
            return;
        }

        products.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        Product product = products.get(id);

        if (product == null) {
            System.out.println("Product Not Found.");
            return;
        }

        product.setProductName(name);
        product.setQuantity(quantity);
        product.setPrice(price);

        System.out.println("Product Updated Successfully.");
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (products.remove(id) != null)
            System.out.println("Product Deleted.");
        else
            System.out.println("Product Not Found.");
    }

    // Search Product
    public void searchProduct(int id) {

        Product product = products.get(id);

        if (product == null)
            System.out.println("Product Not Found.");
        else
            System.out.println(product);
    }

    // Display Inventory
    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Inventory Empty");
            return;
        }

        System.out.println("----------------------------------------------");
        System.out.printf("%-8s %-20s %-10s %s\n",
                "ID", "Name", "Qty", "Price");
        System.out.println("----------------------------------------------");

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("----------------------------------------------");
    }

    // Total Inventory Value
    public void totalValue() {

        double total = 0;

        for (Product p : products.values()) {
            total += p.getPrice() * p.getQuantity();
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }
}