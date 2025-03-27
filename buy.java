import java.util.*;

public class buy {
    
    public static void buy(){
            Scanner scanner = new Scanner(System.in);
    
            //Prompts user with items
            System.out.println("\nWhat would you like to buy? (If you would like more info on an item type info)");
            System.out.println("1: Laptop\n2: Textbook\n3: Switch\n4: Backpack\n5: Pens\n6: Go back");
            String buy = scanner.nextLine();
    
            switch (buy) {
                case "info":
                    //if info is entered, prompts user to enter number of item they want more info on
                    System.out.println("\nWhich item would you like more info on?");
                    System.out.println("1: Laptop\n2: Textbook\n3: Switch\n4: Backpack\n5: Pens\n6: Go back");
                    String info = scanner.nextLine();

                    //Entered number gives corresponding info
                    switch (info) {
                        case "1":
                            System.out.println("\nItem: Laptop\nCategory: Electronics\nSeller: Lucas Jenkins lucas.jenkins@quinnipiac.edu\nPrice: $1000.00");
                            buy();
                            break;
                        case "2":
                            System.out.println("\nItem: Textbook\nCategory: Books\nSeller: Isabela Ayers  leila.ayers@quinnipiac.edu\nPrice: $20.00");
                            buy();
                            break;
                        case "3":
                            System.out.println("\nItem: Switch\nCategory: Electronics\nSeller: Daniel Tracz daniel.tracz@quinnipiac.edu\nPrice: $300.00");
                            buy();
                            break;
                        case "4":
                            System.out.println("\nItem: Backpack\nCategory: Clothing\nSeller: Kate Francis kate.francis@quinnipiac.edu\nPrice: $25.00");
                            buy();
                            break;
                        case "5":
                            System.out.println("\nItem: Pens\nCategory: Writing utensils\nSeller: Lucas Jenkins lgjenkins@quinnipiac.edu\nPrice: $10.00");
                        case "6":
                            buy();
                            break;
                        default:
                    }
                    break;
                //If number is entered, corresponding item is added to cart
                case "1":
                    System.out.println("Laptop has been added to cart");
                    break;
                case "2":
                    System.out.println("Textbook has been added to cart");
                    break;
                case "3":
                    System.out.println("Switch has been added to cart");
                    break;
                case "4":
                    System.out.println("Backpack has been added to cart");
                    break;
                case "5":
                    System.out.println("Pens have been added to cart");
                    break;
                case "6":
                    System.out.println("Back to menu");
                    //method to go back to main menu will go here
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } 
}
