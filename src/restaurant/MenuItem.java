package restaurant;

import java.util.Objects;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean itemNew;

    public MenuItem(String name, double price, String description, String category, boolean itemNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.itemNew = itemNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String isItemNew() {
        return itemNew ? "Yes" : "No";

    }

    public void setItemNew(boolean itemNew) {
        this.itemNew = itemNew;
    }

    public void printItem() {
        System.out.println("\n***Item***\n\n" + "Name: " + name +
                "\nPrice: $" + price +
                "\nDescription: " + description +
                "\nCategory: " + category +
                "\nIs item new?: " + itemNew);
    }

    @Override
    public String toString() {
        return  "\nName: " + name + '\n' +
                "Price: $" + price + '\n' +
                "Description: " + description + '\n' +
                "Category: " + category + '\n' +
                "Is item new?: " + itemNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
