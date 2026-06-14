//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double price = 120.00;
        double taxRate = 0.05;

        double salesTax = price * taxRate;
        double total = price + salesTax;

        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("Total: $" + total);
    }
}
