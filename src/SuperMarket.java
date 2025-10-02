import java.util.ArrayList;

public class SuperMarket {
    ArrayList<Product> products;
    String name;

    public SuperMarket(String name, ArrayList<Product> products) {
        if (products == null) {
            this.products = new ArrayList<>();
        } else {
            this.products = products;
        }
        this.name = name;
    }

    public void buyItem(Product product, int amount) {
        if (product.amount >= amount) {
            product.amount -= amount;
            System.out.println("You bought " + amount + " " + product.name + " for " +  product.price * amount + " euro.");
        } else {
            System.err.println("You cannot buy " + amount + " " + product.name + ", we have only " + product.amount + " " + product.name + " in stock");
        }
    }
}
