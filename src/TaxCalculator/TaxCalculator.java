package TaxCalculator;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 15.2;
        double tax = 7.5;
        int quant = 20;
        double total = 0;
        String message = "I want to buy " + quant + " shirt!";
        System.out.println(message);
        total = price * quant * tax;
        System.out.println("Total cost with tax is " + total);


    }
}
