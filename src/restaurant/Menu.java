package restaurant;

import java.util.Date;
import java.util.List;

public class Menu {
    private List<MenuItem> items;
    private Date dateUpdated;

    public Menu(List<MenuItem> items, Date dateUpdated) {
        this.items = items;
        this.dateUpdated = dateUpdated;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void addMenuItem(MenuItem item) {
            this.items.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        this.items.remove(item);
    }

    public void printMenu() {
        System.out.println("\n***Menu***");
        for (MenuItem item: items) {
            System.out.println(item);
        }
        System.out.println("\n[Menu Last Updated: " + dateUpdated + "]");

    }
}

