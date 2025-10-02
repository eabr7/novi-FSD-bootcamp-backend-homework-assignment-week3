import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product("Apple",10, 3.0);
        Product banana = new Product("Banana", 5, 1.5);
        Product pear = new Product("Pear", 8, 2.0);
        Product peach = new Product("Peach", 5, 2.5);

        ArrayList <Product> fruit = new ArrayList<>();
        fruit.add(apple);
        fruit.add(banana);
        fruit.add(pear);
        fruit.add(peach);

        Product broccoli = new Product("Broccoli",6, 1.0);
        Product carrot = new Product("Carrot", 20, 0.5);
        Product zucchini = new Product("Zucchini", 10, 2.5);
        Product spinach = new Product("Spinach", 15, 1.5);

        ArrayList <Product> vegetables = new ArrayList<>();
        fruit.add(broccoli);
        fruit.add(carrot);
        fruit.add(zucchini);
        fruit.add(spinach);

        Product milk = new Product("Milk",30, 1.0);
        Product yoghurt = new Product("Yoghurt", 17, 2.0);
        Product cheese = new Product("Cheese", 20, 3.5);
        Product butter = new Product("Butter", 10, 1.5);

        ArrayList <Product> dairy = new ArrayList<>();
        fruit.add(milk);
        fruit.add(yoghurt);
        fruit.add(cheese);
        fruit.add(butter);

// ----------------------------------------------------------------------------------------------

        ArrayList<Product> productsHalbertEijn = new ArrayList<>();
        ArrayList<Product> productsDumbo = new ArrayList<>();
        ArrayList<Product> productsCaldi = new ArrayList<>();

        HashMap<String, SuperMarket> allMarkets = new HashMap<>();
        allMarkets.put("halbert eijn", new SuperMarket("Halbert Eijn", productsHalbertEijn));
        allMarkets.put("dumbo",        new SuperMarket("Dumbo",        productsDumbo));
        allMarkets.put("caldi",        new SuperMarket("Caldi",        productsCaldi));

// ----------------------------------------------------------------------------------------------

        Customer customer = new Customer("Customer");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which product do you want to buy?");
        String name = scanner.nextLine();
        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();

        customer.buyItem(name, amount);
        customer.goToSupermarket(superMarket);
        customer.buyItem(name, amount);

//        Dit kan ook
        customer.buyItem("cheese", 2);

//        Deze moeten foutmeldingen geven
        customer.buyItem("fruit", 200);
        customer.buyItem("beer", 24);


    }
}
