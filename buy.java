import java.util.*;

public class buy {

    public static void buy(){
            Scanner scanner = new Scanner(System.in);
    
            //Prompts user with items
            System.out.println("\nWhat would you like to buy? (If you would like more info on an item type info)");
            System.out.println("1: Framework Laptop 16\n2: Math Textbook\n3: Nintendo Switch OLED Model\n4: QU Branded Pens\n5: LTT Computer Backpack\n6: Go back");
            String buy = scanner.nextLine();
    
            switch (buy) {
                case "info":
                    //if info is entered, prompts user to enter number of item they want more info on
                    System.out.println("\nWhich item would you like more info on?");
                    System.out.println("1: Framework Laptop 16\n2: Math Textbook\n3: Nintendo Switch OLED Model\n4: QU Branded Pens\n5: LTT Computer Backpack\n6: Go back");
                    String info = scanner.nextLine();

                    //Entered number gives corresponding info
                    switch (info) {
                        case "1":
                            System.out.println("\nItem: Framework Laptop 16\nCategory: Tech\nSeller: Lucas Jenkins lucas.jenkins@quinnipiac.edu\nPrice: $1600.00");
                            buy();
                            break;
                        case "2":
                            System.out.println("\nItem: Math Textbook\nCategory: Books\nSeller: Isabela Ayers  leila.ayers@quinnipiac.edu\nPrice: $200.00");
                            buy();
                            break;
                        case "3":
                            System.out.println("\nItem: Nintendo Switch OLED Model\nCategory: Tech\nSeller: Lucas Jenkins lucas.jenkins@quinnipiac.edu\nPrice: $340.00");
                            buy();
                            break;
                        case "4":
                            System.out.println("\nItem: QU Branded Pens\nCategory: Apparel\nSeller: Kate Francis kate.francis@quinnipiac.edu\nPrice: $4.00");
                            buy();
                            break;
                        case "5":
                            System.out.println("\nItem: LTT Computer Backpack\nCategory: Apparel\nSeller: Daniel Tracz daniel.tracz@quinnipiac.edu\nPrice: $50.00");
                        case "6":
                            buy();
                            break;
                        default:
                    }
                    break;
                //If number is entered, corresponding item is added to cart
                case "1":
                    Cart.addItem("Framework Laptop 16", 1600.00);
                    Main.main(null);
                    break;
                case "2":
                    Cart.addItem("Math Textbook", 200.00);
                    Main.main(null);
                    break;
                case "3":
                    Cart.addItem("Nintendo Switch OLED Model", 340.00);
                    Main.main(null);
                    break;
                case "4":
                    Cart.addItem("QU Branded Pens", 4.00);
                    Main.main(null);
                    break;
                case "5":
                    Cart.addItem("LTT Computer Backpack", 50.00);
                    Main.main(null);
                    break;
                case "6":
                    System.out.println("Back to menu");
                    Main.main(null);
                    break;
                default:
                    System.out.println("Invalid input");
                    buy();
                    break;
            }
        } 
}
