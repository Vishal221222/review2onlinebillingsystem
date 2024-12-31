Online Billing System in Java
Introduction
This is a simple Online Billing System implemented in Java that allows users to add items to their shopping cart, calculate the total price, and generate a bill. It simulates an online shopping experience where the user can input product details like the name, quantity, and price, and later generate a final bill displaying the total price.

Features
Add items to the cart by providing product name, quantity, and price.
Calculate the total cost of the items.
Generate a bill with itemized details, including the total price.
Simple console-based interface for interaction.
Requirements
Java 8 or above (for running the Java program).
Basic understanding of Java programming concepts like classes, objects, and ArrayLists.
Program Structure
Classes:
Item: Represents an item in the cart, holding details such as item name, quantity, price per unit, and total price for that item.
OnlineBillingSystem: The main class that runs the application, provides an interface to interact with the user, and processes the data for billing.
Methods:
addItem(): Prompts the user to enter item details and adds the item to the shopping cart.
generateBill(): Displays the bill showing all added items and calculates the total amount.
main(): The entry point for the program that displays a menu for users to interact with the system.
How to Use
Clone the repository:

bash
Copy code
git clone <repository-url>
cd <repository-directory>
Compile the program: Open a terminal/command prompt and navigate to the directory where the Java file is located. Run the following command to compile the program:

bash
Copy code
javac OnlineBillingSystem.java
Run the program: After successful compilation, run the program using the command:

bash
Copy code
java OnlineBillingSystem
Interact with the system: The program will present a menu with the following options:

Add Item: Enter the details of the item (name, quantity, and price).
Generate Bill: Displays the full bill with item details and the total cost.
Exit: Exit the program.
