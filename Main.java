import java.util.Scanner;
public class Main {

    private static int count = 1;

    public static void main(String[] args) {
        

        if(count == 1){
            count = 0;
            Login.main(null);
        }

         Scanner input = new Scanner(System.in);

        System.out.println("What would you like to do, Buy, Sell, Cart, or Logout?");
        String in = input.nextLine().toUpperCase();
        if ("BUY".equals(in)) {
            //Buy.main(null);
        }
        if ("SELL".equals(in)) {
            Sell.main(null);
        }
        if ("CART".equals(in)) {
            //Cart.main(null);
        }
        if ("LOGOUT".equals(in)) {
            Logout.main(null);
        }
    }
}