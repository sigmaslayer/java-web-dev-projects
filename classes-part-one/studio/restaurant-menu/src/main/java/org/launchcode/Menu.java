package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date dateUpdated;

    private String restaurantName;

    private ArrayList<MenuItem> menuItems;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.dateUpdated = d;
        this.menuItems = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.dateUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.menuItems = items;
    }

    public Date getLastUpdated() {
        return dateUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }
}
