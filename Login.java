import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    private static final Map<String, String> user = new HashMap<>();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int selection;

        do{
            System.out.println("▄▄▌ ▐ ▄▌▄▄▄ .▄▄▌   ▄▄·       • ▌ ▄ ·. ▄▄▄ .    ▄▄▄▄▄          ▄▄▄▄▄ ▄ .▄▄▄▄ .    .▄▄ · ▄▄▄▄▄      ▄▄▄  ▄▄▄ .\n" + //
                                "██· █▌▐█▀▄.▀·██•  ▐█ ▌▪▪     ·██ ▐███▪▀▄.▀·    •██  ▪         •██  ██▪▐█▀▄.▀·    ▐█ ▀. •██  ▪     ▀▄ █·▀▄.▀·\n" + //
                                "██▪▐█▐▐▌▐▀▀▪▄██▪  ██ ▄▄ ▄█▀▄ ▐█ ▌▐▌▐█·▐▀▀▪▄     ▐█.▪ ▄█▀▄      ▐█.▪██▀▐█▐▀▀▪▄    ▄▀▀▀█▄ ▐█.▪ ▄█▀▄ ▐▀▀▄ ▐▀▀▪▄\n" + //
                                "▐█▌██▐█▌▐█▄▄▌▐█▌▐▌▐███▌▐█▌.▐▌██ ██▌▐█▌▐█▄▄▌     ▐█▌·▐█▌.▐▌     ▐█▌·██▌▐▀▐█▄▄▌    ▐█▄▪▐█ ▐█▌·▐█▌.▐▌▐█•█▌▐█▄▄▌\n" + //
                                " ▀▀▀▀ ▀▪ ▀▀▀ .▀▀▀ ·▀▀▀  ▀█▄▀▪▀▀  █▪▀▀▀ ▀▀▀      ▀▀▀  ▀█▄▀▪     ▀▀▀ ▀▀▀ · ▀▀▀      ▀▀▀▀  ▀▀▀  ▀█▄▀▪.▀  ▀ ▀▀▀ ");
            System.out.println("\n1. Sign up");
            System.out.println("\n2. Login");
            System.out.println("\n3. Exit");

            selection = scan.nextInt();
            scan.nextLine();

            switch(selection){
                case 1:
                    newUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    System.out.println("Exiting App");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter either 1, 2, or 3 as an option.");
            }
        } while(selection != 3);
        //scan.close();
    }
    //user is creating a new account
    private static void newUser(){
        System.out.println("Enter your email address: ");
        String email = scan.nextLine();
        System.out.println("Enter the password you would like to associate with your account: ");
        String password = scan.nextLine();

        //if user is trying to create a new account with an email that is already in the system
        if (user.containsKey(email)){
            System.out.println("Email already associated with a registered account.");
            return;
        }

        user.put(email, password);
        System.out.println("You have successfully created an account!");
    }

    //user already has an account and is logging in
    private static void loginUser(){
        int attempts = 0;
        boolean loggedIn = false;
        int option;

        while (attempts < 3 && !loggedIn){
            System.out.println("Enter your email address: ");
            String email = scan.nextLine();

            System.out.println("Enter password: ");
            String password = scan.nextLine();

            if (user.containsKey(email) && user.get(email).equals(password)){
                System.out.println("You have successfully been logged in.");
                loggedIn = true;

            } else{
                attempts++;
                System.out.println("You have entered either an invalid email or password." + (3 - attempts) + "attempts remaining.");
            }
        }
        //give the user the options: buy sell cart logout
        if (loggedIn = true){
            System.out.println("Please choose one of the following options: ");
                System.out.println("1. Buy");
                System.out.println("2. Sell");
                System.out.println("3. Cart");
                System.out.println("4. Logout");

                option = scan.nextInt();
                scan.nextLine();

                //call each class so that the "app" runs correctly
                switch(option){
                    case 1:
                     //Buy.main(null);
                        break;
                    case 2: 
                    Sell.main(null);
                        break;
                    case 3:
                     //Cart.main(null);
                        break;
                    case 4: 
                    Logout.main(null);
                        break;
                    default: 
                    System.out.println("Invalid choice. Please enter either 1, 2, 3, or 4 as an option.");
                }
        } else
        System.out.println("Too many attempts. Your account has been locked.");
    }
}
