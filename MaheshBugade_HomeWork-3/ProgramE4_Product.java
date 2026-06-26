class Product {
    String name;
    double price;
    int quantity;
}

public class ProgramE4_Product {
    public static void main(String[] args) {
        Product product = new Product();
        product.price = 50000;
        product.quantity = 2;
        double totalPrice = product.price * product.quantity;
        System.out.println(totalPrice);
    }
}