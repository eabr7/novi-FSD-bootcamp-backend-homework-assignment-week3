public class Customer {
    String name;
    SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSupermarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount) {
        if (superMarket == null) {
            System.out.println("Select a supermarket to go to first");
            return;
        }

        for (Product product : superMarket.products) {
            if (product.name.equalsIgnoreCase(productName)) {
                superMarket.buyItem(product, amount);
                return;
            }
        }
        System.out.println(superMarket.name + " does not sell " + productName);
    }
}
