import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a language: ");
        System.out.println("1. English (en)");
        System.out.println("2. Finish (fi)");
        System.out.println("3. Japanese (jp)");
        System.out.println("4. Swedish (sv)");
        System.out.println(">>> ");

        int choice = scanner.nextInt();
        Locale locale;
        switch(choice) {
            case 1:
                locale = new Locale("en", "UK");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("jpn", "JP");
                break;
            case 4:
                locale = new Locale("sv", "SE");
                break;
            default:
                locale = new Locale("en", "UK");
        }

        double total = 0.0;
        double totalOfAll = 0.0;
        ResourceBundle resourceBundle = ResourceBundle.getBundle("MessageBundle", locale);
        System.out.println("Shopping cart...");
        System.out.println(resourceBundle.getString("prompt1"));
        double amount = scanner.nextInt();
        for (int i = 0; i < amount; i++){
            System.out.println(resourceBundle.getString("prompt2"));
            double price = scanner.nextDouble();
            System.out.println(resourceBundle.getString("prompt3"));
            int quantity = scanner.nextInt();
            total = calculateTotalCost(price, quantity);
            System.out.println(resourceBundle.getString("total") + total);
            totalOfAll += costaOfAllItems(total);
        }
        System.out.println(resourceBundle.getString("totalAll") + totalOfAll);
    }

    public static double calculateTotalCost(double price, double quantity){
        return price * quantity;
    }

    public static double costaOfAllItems(double total){
        return total;
    }

}
