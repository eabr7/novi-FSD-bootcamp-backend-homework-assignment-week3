import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product("Apple", 10, 3.0);
        Product banana = new Product("Banana", 5, 1.5);
        Product pear = new Product("Pear", 8, 2.0);
        Product peach = new Product("Peach", 5, 2.5);

        ArrayList<Product> fruit = new ArrayList<>();
        fruit.add(apple);
        fruit.add(banana);
        fruit.add(pear);
        fruit.add(peach);

        Product broccoli = new Product("Broccoli", 6, 1.0);
        Product carrot = new Product("Carrot", 20, 0.5);
        Product zucchini = new Product("Zucchini", 10, 2.5);
        Product spinach = new Product("Spinach", 15, 1.5);

        ArrayList<Product> vegetables = new ArrayList<>();
        fruit.add(broccoli);
        fruit.add(carrot);
        fruit.add(zucchini);
        fruit.add(spinach);

        Product milk = new Product("Milk", 30, 1.0);
        Product yoghurt = new Product("Yoghurt", 17, 2.0);
        Product cheese = new Product("Cheese", 20, 3.5);
        Product butter = new Product("Butter", 10, 1.5);

        ArrayList<Product> dairy = new ArrayList<>();
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
        allMarkets.put("dumbo", new SuperMarket("Dumbo", productsDumbo));
        allMarkets.put("caldi", new SuperMarket("Caldi", productsCaldi));

// ----------------------------------------------------------------------------------------------

        Customer customer = new Customer("Customer");
        Scanner scanner = new Scanner(System.in);


// -----------------------------------------------------------------------------------------------
        boolean on = true;
        while (on) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Pick a supermarket");
            System.out.println("2 - buy a product");
            System.out.println("3 - restock a product");
            System.out.println("4 - exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Which supermarket do you want to go to?");
                    System.out.println("Pick one of the following:");
                    System.out.println("- Halbert Eijn");
                    System.out.println("- Dumbo");
                    System.out.println("- Caldi");
                    String superMarketChoice = scanner.nextLine().toLowerCase();

                    switch (superMarketChoice) {
                        case "halbert eijn":
                            customer.goToSupermarket(allMarkets.get("halbert eijn"));
                            break;
                        case "dumbo":
                            customer.goToSupermarket(allMarkets.get("dumbo"));
                            break;
                        case "caldi":
                            customer.goToSupermarket(allMarkets.get("caldi"));
                            break;
                        default:
                            System.out.println("Supermarket not available. Pick another supermarket.");
                    }
                    break;
                }

                case 2: {
                    if (customer.superMarket == null) {
                        System.out.println("Pick a supermarket first.");
                        break;
                    }

                    System.out.println("Which product do you want to buy from " + customer.superMarket.name + "?");
                    String name = scanner.nextLine();
                    System.out.println("How many do you want to buy?");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    customer.buyItem(name, amount);
                    break;
                }

                case 3: {
                    System.out.println("Which supermarket do you want to restock?");
                    System.out.println("Pick one of the following:");
                    System.out.println("- Halbert Eijn");
                    System.out.println("- Dumbo");
                    System.out.println("- Caldi");
                    String superMarketChoice = scanner.nextLine().toLowerCase();

                    switch (superMarketChoice) {
                        case "halbert eijn":
                            customer.goToSupermarket(allMarkets.get("halbert eijn"));
                            break;
                        case "dumbo":
                            customer.goToSupermarket(allMarkets.get("dumbo"));
                            break;
                        case "caldi":
                            customer.goToSupermarket(allMarkets.get("caldi"));
                            break;
                        default:
                            System.out.println("Supermarket not available. Pick another supermarket.");
                    }


                    System.out.println("Which product do you want to restock in " + superMarketChoice + "?");
                    String name = scanner.nextLine();
                    System.out.println("How many do you want to add?");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    customer.superMarket.restockItem(name, amount);
                    break;
                }

                case 4: {
                    System.out.println("Goodbye.");
                    on = false;
                    break;
                }

               default: {
                   System.out.println("Input is not valid.");
                   break;
               }
            }
        }
    }
}
