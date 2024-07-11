import java.util.List;

public class Main {
    public static void main(String[] args) {
        ManageProducts manageProducts = new ManageProducts();
        List<Product> products =  manageProducts.addDummyData();

        for (Product product : products) {
            System.out.println(product);
            System.out.println();
        }
    }
}