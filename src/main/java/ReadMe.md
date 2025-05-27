# DELIcious Point-of-Sale Ordering System

## 📌 Description of the Project

The **DELIcious Point-of-Sale System** is a Java console-based application designed for a growing custom sandwich shop. Customers can fully customize their sandwich orders by selecting bread types, sandwich sizes, toppings (regular and premium), and optional extras like drinks and chips. This system replaces the manual paper-based process and simulates a real-world deli ordering experience.

The application emphasizes **object-oriented programming**, **menu-driven user interfaces**, **file I/O**, **inheritance**, **encapsulation**, and **realistic pricing logic**. Orders are saved with time-stamped receipts in a dedicated folder.

---

## 📊 Class Diagram

*[Class Diagram](DELIciousClassDiagram.png)*

Key Classes:

* `Order`
* `Sandwich`
* `Topping` (Abstract)

    * `Meat`
    * `Cheese`
    * `RegularTopping`
    * `Sauce`
* `Drink`
* `Chip`
* `ConsoleUI`
* `OrderFileManager`
* `Size`, `BreadType`, `MeatType`, `CheeseType`, etc. (enums)

---

## 🧑‍🍳 User Stories

* As a customer, I want to place a custom sandwich order from multiple options.
* As a customer, I want to choose my bread and sandwich size.
* As a customer, I want to choose meats, cheeses, toppings, and sauces with optional extras.
* As a customer, I want to add multiple sandwiches to a single order.
* As a customer, I want to add drinks and chips to my order.
* As a customer, I want to view a clear order summary before confirming.
* As a customer, I want my order to be saved with a receipt named by the time it was placed.

---

## ⚙️ Setup

### Prerequisites

* **IntelliJ IDEA**: [Download IntelliJ](https://www.jetbrains.com/idea/)
* **Java SDK 17+**: Required for project compatibility

### GitHub Capstone Setup

1. Create a public GitHub repository with a meaningful name (e.g., `DELIcious`)
2. Clone the repo into `C:/pluralsight/LearnToCode_Capstones/DELIcious`
3. Create a GitHub Project Board with tasks based on user stories

### Running the Application

1. Open the project in IntelliJ IDEA
2. Locate and run the `Main.java` file (entry point for the application)
3. Follow the console prompts to build orders

---

## 🛠️ Technologies Used

* **Java 17+** – Programming Language
* `java.util.*` – ArrayList, Scanner, Enum
* `java.io.*` – FileWriter, BufferedWriter for receipts
* **OOP Concepts** – Inheritance, Abstraction, Polymorphism, Encapsulation
* **File I/O** – Receipt persistence in `/receipts` folder

---

## 💾 Receipt Format

Receipts are saved as individual `.txt` files in a `receipts/` folder with this naming format:

```
yyyyMMdd-HHmmss.txt
Example: 20230527-141502.txt
```

Each receipt contains:

* Full sandwich breakdown
* Drink and chip items
* Total price

---

## 📜 Application Screens

### Home Screen

* `1) New Order`
* `0) Exit`

### Order Screen

* `1) Add Sandwich`
* `2) Add Drink`
* `3) Add Chips`
* `4) Checkout`
* `0) Cancel Order`

### Add Sandwich

* Select Bread: White, Wheat, Rye, Wrap
* Select Size: 4", 8", 12"
* Add Meats (Premium): Steak, Ham, Salami, Roast Beef, Chicken, Bacon
* Add Cheese (Premium): American, Provolone, Cheddar, Swiss
* Add Regular Toppings: Lettuce, Peppers, Onions, Tomatoes, Jalapeños, etc.
* Add Sauces: Mayo, Mustard, Ranch, etc.
* Choose Toasted or Not

### Add Drink

* Choose size (Small, Medium, Large)
* Enter flavor

### Add Chips

* Enter chip type (e.g., BBQ, Sour Cream, Original)

### Checkout

* Displays full order details
* `1) Confirm` – Saves receipt and returns to home screen
* `0) Cancel` – Discards order and returns to home screen

---

## 🍪 Pricing

### Sandwich Prices (by Size & Bread)

| Bread Type | 4"     | 8"     | 12"    |
| ---------- | ------ | ------ | ------ |
| Any Bread  | \$5.50 | \$7.00 | \$8.50 |

### Premium Toppings

| Topping      | 4"     | 8"     | 12"    |
| ------------ | ------ | ------ | ------ |
| Meats        | \$1.00 | \$2.00 | \$3.00 |
| Extra Meat   | \$0.50 | \$1.00 | \$1.50 |
| Cheese       | \$0.75 | \$1.50 | \$2.25 |
| Extra Cheese | \$0.30 | \$0.60 | \$0.90 |

### Regular Toppings & Sauces

Included with sandwich (no extra cost)

### Sides

| Item  | Small  | Medium | Large  |
| ----- | ------ | ------ | ------ |
| Drink | \$2.00 | \$2.50 | \$3.00 |
| Chips | \$1.50 | —      | —      |

---

## 🔧 Bonus Feature (Optional)

Signature Sandwich Templates:

* Pre-built sandwiches based on `Sandwich` class
* User can customize further (add/remove toppings)

### Examples:

**BLT**

* 8" White Bread, Bacon, Cheddar, Lettuce, Tomato, Ranch, Toasted

**Philly Cheese Steak**

* 8" White Bread, Steak, American Cheese, Peppers, Mayo, Toasted
