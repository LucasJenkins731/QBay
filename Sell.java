import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Sell {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        boolean isDone = false;
        boolean isLoop = true;
        String in;
        int in2;
        int i = 1;
        int itemCount = 5;

        String itemArray[] = new String [99];
        itemArray[0] = "Framework Laptop 16";
        itemArray[1] = "Math Textbook";
        itemArray[2] = "Nintendo Switch OLED Model";
        itemArray[3] = "QU Branded Pens";
        itemArray[4] = "LTT Commuter Backpack";

        String itemCategory[] = new String[99];
        itemCategory[0] = "Tech";
        itemCategory[1] = "Books";
        itemCategory[2] = "Tech";
        itemCategory[3] = "Apperal";
        itemCategory[4] = "Apperal";

        double itemPrice[] = new double[99];
        itemPrice[0] = 1600.00;
        itemPrice[1] = 200.00;
        itemPrice[2] = 340.00;
        itemPrice[3] = 4.0;
        itemPrice[4] = 50.0;

        NumberFormat formatter = new DecimalFormat("#0.00");


        while (isLoop) {
            //System.out.println("Would you like to see your current items sell, Or would you like to sell a new item?");
            System.out.println(" ");
            System.out.println("---------------");
            System.out.println("What would you like to do?");
            System.out.println("View : See your current items sell");
            System.out.println("Sell : Add an item to sell");
            System.out.println("Exit : Exits to the main menu");
            System.out.println("---------------");
            System.out.println(" ");



            in = input.nextLine().toUpperCase();


            if ("VIEW".equals(in)) {
                //System.out.println(" ");
                while (i <= itemCount) {
                    System.out.println(i + ". " + itemArray[i-1]);
                    System.out.println("  " + itemCategory[i-1]);
                    System.out.println("  $" + formatter.format(itemPrice[i-1]));
                    i++;
                }
                i = 1;

                System.out.println(" ");
                System.out.println("Would you like to edit a listing? y/n");
                in = input.nextLine().toUpperCase();

                if ("Y".equals(in) || "YES".equals(in) || "EDIT".equals(in)) {
                    System.out.println("> Editor mode engaged");
                    System.out.println("> You currently have [" + itemCount + "] items for sale");
                    System.out.println(" ");
                    System.out.println("Which item number would you like to edit?");
                    in2 = input2.nextInt();
                    in2--;
                    System.out.println("And which part would you like to edit, the name, category, or price?");
                    in = input.nextLine().toUpperCase();

                    if ("NAME".equals(in)) {
                        System.out.println("[Old name: " + itemArray[in2] + "]");
                        System.out.println("Set the new name:");
                        in = input.nextLine();
                        itemArray[in2] = in;
                    }
                    if ("CATEGORY".equals(in)) {
                        System.out.println("[Old category: " + itemCategory[in2] + "]");
                        System.out.println("Set the new name:");
                        in = input.nextLine();
                        itemArray[in2] = in;
                    }
                    if ("PRICE".equals(in)) {
                        System.out.println("[Old price: " + itemPrice[in2] + "]");
                        System.out.println("Set the new name:");
                        in2 = input2.nextInt();
                        itemArray[in2] = in;
                    }
                    else {
                        System.out.println("input not recognized as valid, please try again");
                    }
                }


            } else if ("SELL".equals(in)) {
                System.out.println("What would you like to sell?");
                in = input.nextLine();
                itemArray[itemCount++] = in;
                itemCount--;
                in = input.nextLine();
                itemCategory[itemCount++] = in;

            } else if ("EXIT".equals(in)) {
                isLoop = false;
                //break;
                Login.main(null);

            } else {
                System.out.println("input not recognized as valid, please try again");
            }
    }

    }    
}