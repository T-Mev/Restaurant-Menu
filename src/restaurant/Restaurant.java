
package restaurant;
import java.util.*;

public class Restaurant {
    public static void main(String[] args) {
//      Creating initial menu items
        MenuItem lobster = new MenuItem("Lobster",101.99, "'Best Lobster Ever'", "Main Course", true);
        MenuItem soup = new MenuItem("Broccoli Soup",7.99, "'Drink Your Vegetables'", "Appetizer",false);
        MenuItem cookie = new MenuItem("Chocolate Chip Cookie",1.99, "'Freshly Baked Cookie'", "Dessert",true);

//      Creating initial menu list
        List<MenuItem> menuList = new ArrayList<>();
        menuList.add(lobster);
        menuList.add(soup);
        menuList.add(cookie);

        //Creating and printing initial menu
        Menu newMenu = new Menu(menuList, new Date());
        System.out.println("\n▶▶Initial Menu:");
        newMenu.printMenu();

//      Printing single item
        System.out.println("\n▶▶Single item:");
        lobster.printItem();

//      Adding and printing menu with new item
        MenuItem salad = new MenuItem("Greek Salad",5.99, "'Tasty salad'", "Appetizer",true);
        newMenu.addMenuItem(salad);
        newMenu.setDateUpdated(new Date());
        System.out.println("\n▶▶Menu with new item (Salad) added:");
        newMenu.printMenu();

//      Removing and printing menu with item removed
        System.out.println("\n▶▶Menu with item (Lobster) removed:");
        newMenu.removeMenuItem(lobster);
        newMenu.setDateUpdated(new Date());
        newMenu.printMenu();

////      Determining whether two different menu items are equal
//        System.out.println("\n▶▶Are menu items cookie and lobster equal?");
//        System.out.println(cookie.equals(lobster));

//        //      Determining whether two of the same menu items are equal
//        MenuItem cookie2 = new MenuItem("Chocolate Chip Cookie",1.99, "'Freshly Baked Cookie'", "Dessert",true);
//        System.out.println("\n▶▶Are menu items cookie and cookie2 equal?");
//        System.out.println(cookie.equals(cookie2));
    }
}
