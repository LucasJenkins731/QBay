import java.util.*;

public class Cart {
    private static ArrayList<String> items = new ArrayList<>();
    private static ArrayList<Double> prices = new ArrayList<>();

    public static void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
        System.out.println(item+" has been added to the cart.");
    }

    public static void checkCart() {
        if (items.isEmpty()) {
            System.out.println("\n Your cart is empty.");
            return;
        }

        System.out.println("\n Items in your cart:");
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i)+" - $"+prices.get(i));
            total += prices.get(i);
        }
        System.out.println("Total Price: $"+total);

        Scanner s = new Scanner(System.in);
        System.out.println("\n 1: Purchase\n 2: Go back");
        String choice = s.nextLine();

        if (choice.equals("1")) {
            purchase();
        } else {
            Main.main(null);
        }
    }

    public static void purchase() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\n Purchase complete. You purchased:");
        for (String item : items) {
            System.out.println("- "+item);
        }

        items.clear();
        prices.clear();
        System.out.println("Your cart is empty now");
        Main.main(null);
    }
}