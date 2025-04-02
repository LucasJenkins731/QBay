import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Login.main(null);

        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to do, Buy, Sell, Cart, or Logout?");
        String in = input.nextLine().toUpperCase();
        if ("BUY".equals(in)) {
            buy.buy();
        }
        if ("SELL".equals(in)) {
            Sell.main(null);
        }
        if ("CART".equals(in)) {
            Cart.checkCart();
        }
        if ("LOGOUT".equals(in)) {
            Logout.main(null);
        }
    }
}
