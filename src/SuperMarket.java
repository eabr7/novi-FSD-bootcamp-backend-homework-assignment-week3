import java.util.ArrayList;

public class SuperMarket {
    ArrayList<Product> products;

    public SuperMarket(ArrayList<Product> products) {
        if (products == null) {
            this.products = new ArrayList<>();
        } else {
            this.products = products;
        }
    }


    // ----------------------------------------------

    public void buyBread(int amount){
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount){
        buyItem(this.fruit, amount);
    }

    public void buyToiletPaper(int amount){
        buyItem(this.toiletPaper, amount);
    }

    public void buyCheese(int amount){
        buyItem(this.cheese, amount);
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
