import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        ManageProducts manageProducts = new ManageProducts();
        List<Product> products =  manageProducts.addDummyData();

        products.stream().filter(product -> product.getCategory().equals("Books")
                                         && product.getPrice() > 100)
                         .forEach(product -> System.out.println(product.toString()));
    }
}
