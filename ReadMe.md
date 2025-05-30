# 🥪 DELIcious - Sandwich POS Ordering System

## 📌 Project Description

**DELIcious** is a Java console-based Point of Sale (POS) application for a custom sandwich shop. It enables customers to fully customize their orders with sandwiches, drinks, and chips, and receive itemized receipts. Built using object-oriented principles, the project simulates a real-world restaurant workflow and features advanced components like signature sandwiches, dynamic pricing based on size and extras, and file-based receipt management.

---

## 🧱 Key Features

* Customize Sandwiches with:

  * Bread (White, Wheat, Rye, Wrap)
  * Size (4", 8", 12")
  * Toppings: Regular and Premium (Meat, Cheese, Sauce)
  * Toasted or Not
* Add multiple sandwiches, drinks, and chips per order
* Choose from Signature Sandwiches:

  * BLT
  * Philly Cheese Steak
  * Veggie Delight
* Ability to customize signature sandwiches (add/remove toppings)
* Full receipt generation with timestamped filenames
* Accurate price calculation based on item type and size

---

## 🧑‍💼 User Stories

* As a customer, I want to:

  * Build my own sandwich with detailed options.
  * Choose a pre-defined signature sandwich.
  * Add chips and drinks.
  * View an order summary with pricing.
  * Cancel or confirm my order.
  * Receive a saved receipt in a `receipts` folder.

---

## 💸 Pricing Model

| Item              | 4"       | 8"       | 12"      |
| ----------------- | -------- | -------- | -------- |
| Sandwich (Base)   | \$5.50   | \$7.00   | \$8.50   |
| Meat (per type)   | \$1.00   | \$2.00   | \$3.00   |
| Extra Meat        | \$0.50   | \$1.00   | \$1.50   |
| Cheese (per type) | \$0.75   | \$1.50   | \$2.25   |
| Extra Cheese      | \$0.30   | \$0.60   | \$0.90   |
| Regular Toppings  | Included | Included | Included |
| Sauces            | Included | Included | Included |
| Drinks            | \$2.00   | \$2.50   | \$3.00   |
| Chips             | \$1.50   | \$1.50   | \$1.50   |

---

## 🧪 Screens

### 🏠 Home Screen

```
==== Home ====
1) New Order
0) Exit
```

### 🧾 Order Screen

```
1. Add Sandwich
2. Add Drink
3. Add Chips
4. Checkout
5. Signature Sandwich
0. Cancel Order
```

### 🥪 Add Sandwich

* Choose bread
* Select size
* Add meat, cheese, regular toppings, sauces
* Choose toasted or not

### ⭐ Signature Sandwich Menu

* Choose from BLT, Philly Cheese Steak, or Veggie Delight
* Optionally customize toppings afterward

---

## 📄 Receipt Output

* Created inside `receipts/` folder
* File format: `yyyyMMdd-HHmmss.txt`
* Contains:

  * Sandwich details (bread, size, toppings, toasted status)
  * Chips and drinks
  * Total cost

---

## 🧰 Technologies Used

* Java 17+
* OOP (Abstraction, Inheritance, Polymorphism)
* File I/O: `BufferedWriter`, `File`
* Enums for fixed topping types
* Scanner for user input
* Git for version control

---

## 🗂️ Folder Structure

```
src/
├── com.pluralsight.model         // Sandwich, Order, Chips, Drink
├── com.pluralsight.toppings      // Topping, Cheese, Meat, Sauce, RegularTopping
├── com.pluralsight.enums         // Enum types for toppings
├── com.pluralsight.ui            // ConsoleUI interaction
├── com.pluralsight.data          // OrderFileManager for receipt saving
├── com.pluralsight.signatures    // Signature sandwich subclasses
```

---

## ✅ Setup Instructions

1. Clone the repository into your capstones directory:

```bash
git clone https://github.com/yourusername/DELIcious.git
```

2. Open project in IntelliJ
3. Run `Main.java`
4. Enjoy building sandwiches!

---

## 📝 Sample Commit Messages

* `Create base Sandwich and Order classes`
* `Implement pricing logic for premium toppings`
* `Add receipt generation with timestamped filenames`
* `Support signature sandwich customization`
* `Fix meat removal logic and recalculate price`

---

## 🚀 Stretch Goals

* Add a frontend using JavaFX or React
* Save orders to a database
* Implement loyalty rewards or promo codes
* Add login system for staff/cashiers

---

## 📂 Author

Created by Wardah Salman for the Pluralsight Capstone 2 Project.
