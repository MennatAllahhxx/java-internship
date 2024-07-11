import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        ManageProducts manageProducts = new ManageProducts();
        List<Product> products =  manageProducts.addDummyData();

        products.stream().filter(product -> product.getCategory().equals("Books"))
                         .forEach(product -> System.out.println(product.toString()));

    }
}
