import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to do, Buy, Sell, Cart, or Logout?");
        String in = input.nextLine().toUpperCase();
        if ("SELL".equals(in)) {
            Sell.main(null);
        }
    }
}