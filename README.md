# 📦 Product Inventory Management - Java with Lombok & JUnit 5

This is a simple Java project that demonstrates how to use **Lombok** to reduce boilerplate code and **JUnit 5** to write unit tests. The project simulates basic inventory management for a product.

## 🚀 Features

- Create a `Product` class with:
    - `name`: product name
    - `price`: unit price
    - `quantity`: stock quantity
- Automatically generate getters, setters, constructors, and `toString()` using **Lombok**
- Business logic:
    - `getTotalValue()`: calculates total stock value
    - `addStock(int amount)`: increases quantity
    - `removeStock(int amount)`: decreases quantity or throws an exception if amount is too high
- Fully tested with **JUnit 5**

## 🛠 Technologies Used

- Java 17+
- Lombok 1.18+
- JUnit Jupiter (JUnit 5)
- Maven (for dependency management)