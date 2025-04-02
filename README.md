# Challenge-1
## Features
This program will simulate an online shop for its users. Users will be able to create a login and password. Then they will be able to access the merchandise that is for sale, interact with their cart, and more.

Buy:
- User is asked what they would like to buy out of the selection that we offer from the Sell.java class and the user is also given the option to request more information about an item

- When user selects the option to request more informaiton they are given the product nae, product category, who is the seller, the seller's contact information, and the price of the item

- Howver; if the user selects which item they would like to buy, the item and the price is then added to the users cart by calling Cart.java

Cart:
- When the cart class is running the user will be shown teh items they have added to their cart while Buy.java was running
- The user will then be prompted to either purchase their items or to go back to the main menu
- If the user selects to purchase their items, they will be checked out and returned back to the main menu
- If there is nothing in the cart, the user will be prompted with "Your cart is empty" and will be returned to the main menu

Login:

- User is given the choice to either sign up, login, or exit the code
- If the user choses sign up then they will be prompted to enter in the email they want associated with their account and to choose a password
- If the user chooses login then they will be prompted to enter their email and password and if they system checks snd verifies that they have an account they will be loged in, unless they get their email or password wrong 3 times in which they will then be locked out of their account
- If the user chooses exit the program will automatically close

Logout:
- When the logout class is ran the user is automatically logged out and then the login class will start running again, by calling Login.java. This will give the user the options to sign up, login, or exit the program

Sell:
- The user is given the option to view the items they are already currently selling or to add new items they would like to sell
- If the user chooses to view, the current selection of items for sale will be printed out to the user
- If the user chooses to add a new item they will be prompted with options in how to do so

## How to Run
To properly run the code: 

- Run the code from Main.java and the login class will automatically start running which will also run the rest of the classes