// Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete strategies
class CreditCardStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " with credit card");
    }
}

class PayPalStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " with PayPal");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy strategy;

    public ShoppingCart(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        strategy.pay(amount);
    }
}

public class StrategyDesignPattern {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardStrategy());
        cart.checkout(100); // uses credit card algorithm
        cart = new ShoppingCart(new PayPalStrategy());
        cart.checkout(200); // switches to PayPal dynamically

    }
}
// Client usage
