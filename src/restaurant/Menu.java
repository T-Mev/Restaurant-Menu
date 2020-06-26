package restaurant;

public class Menu {
    public static void main(String[] args) {
        MenuItem cookie = new MenuItem(1.99, "Chocolate chip cookie", "Dessert");

        System.out.println("\nDescription: " + cookie.getDescription());
        System.out.println("Cost: $" + cookie.getPrice());
        System.out.println("Category: " + cookie.getCategory());
    }
}
