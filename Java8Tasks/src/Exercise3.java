import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        ManageProducts manageProducts = new ManageProducts();
        List<Product> products =  manageProducts.addDummyData();

        products.stream().filter(product -> product.getCategory().equals("Toys"))
                .forEach(product -> {
                    System.out.println("Product before the discount:");
                    System.out.println(product.toString());
                    product.setPrice(product.getPrice()*0.9);
                    System.out.println("Product after the discount:");
                    System.out.println(product.toString());
                });
    }
}
