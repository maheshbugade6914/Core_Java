class Product {
    String name;
    double price;
    int stock;
}

public class Challenge2_ProductStock {

    public static void main(String[] args) {

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.name = "Laptop";
        product1.stock = 5;

        product2.name = "Mouse";
        product2.stock = 0;

        product3.name = "Keyboard";
        product3.stock = 10;

        if (product1.stock > 0) {
            System.out.println(product1.name);
        }

        if (product2.stock > 0) {
            System.out.println(product2.name);
        }

        if (product3.stock > 0) {
            System.out.println(product3.name);
        }
    }
}
