package antonio.geek.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private int quantity;

    public double getTotalPrice () {
        return price * quantity;
    }

    public void addStock (int amount) {
        this.quantity += amount;
    }

    public void removeStock (int amount) {
        if (amount > this.quantity) {
            throw new IllegalArgumentException("Stock amount exceeded");
        }
        this.quantity -= amount;
    }
}
