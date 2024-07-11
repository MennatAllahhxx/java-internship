import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        ManageProducts manageProducts = new ManageProducts();
        List<Product> products =  manageProducts.addDummyData();

        Product cheapestProduct = products
                                        .stream()
                                        .filter(product -> product.getCategory().equals("Books"))
                                        .findFirst()
                                        .get();


        for (Product product : products) {
            if (product.getCategory().equals("Books") && product.getPrice() < cheapestProduct.getPrice())
                cheapestProduct = product;
        }

        System.out.println("Cheapest product is: " + cheapestProduct.toString());
    }
}
