import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class RestaurantMenu {
    public ArrayList<MenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Burger", 149));
        menuItems.add(new MenuItem("Pizza", 399));
        menuItems.add(new MenuItem("Salad", 720));
        menuItems.add(new MenuItem("Pasta", 179));
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}

class Order {
    private ArrayList<MenuItem> items;
    private ArrayList<Integer> quantities;

    public Order() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }
    public void addItems(MenuItem item,int quantity) {
        items.add(item);
        quantities.add(quantity);
    }

    public double calculateTotal() {
       
        double total=0;
        
        // for (MenuItem menuItem : items) {
        //     for (int quantity : quantities) {
        //         total += menuItem.getPrice() * quantity;
        //     }
        //     f_total += total;
        // }
        MenuItem menuItem;
        for (int i = 0; i < items.size(); i++) {
            menuItem = items.get(i);
            for (int j = 1; j <= quantities.get(i); j++) {
                total += menuItem.getPrice() * 1;
            }
           
        }
        return total;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantMenu restaurantMenu = new RestaurantMenu();
        Order order = new Order();

        int choice;
        do {
            System.out.println("\n1. Display Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. View Order");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayMenu(restaurantMenu);
                    break;
                case 2:
                    addItemToOrder(sc, restaurantMenu, order);
                    break;
                case 3:
                    viewOrder(order);
                    break;
                case 4:
                    System.out.println("Thankyou for visiting have a nice day!!!");
                    break;
                default:
                    System.out.println("Invalid choice please enter a number between 1 to 4!!!");
            }

        } while (choice != 4);
    }

    private static void displayMenu(RestaurantMenu restaurantMenu) {
        System.out.println("\nMenu: ");
        ArrayList<MenuItem> menuItems = restaurantMenu.getMenuItems();
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.getName());
        }
    }
    
    public static void addItemToOrder(Scanner sc, RestaurantMenu restaurantMenu, Order order) {
        displayMenu(restaurantMenu);
        System.out.println("\nEnter the number of the item to add your order: ");
        int itemNumber = sc.nextInt();
        System.out.println("\nEnter the number of Quantity of item: ");
        int quantity = sc.nextInt();
        ArrayList<MenuItem> menuItems = restaurantMenu.getMenuItems();
        if (itemNumber >= 1 && itemNumber <= menuItems.size() && quantity>0) {
            order.addItems(menuItems.get(itemNumber - 1),quantity);
            System.out.println("Item added to your order.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void viewOrder(Order order) {
        System.out.println("\n Your Order: ");
        ArrayList<MenuItem> items = order.getItems();
        for (MenuItem item : items) {
            System.out.println("-> " + item.getName() + ": Rs." + item.getPrice());
        }
        System.out.println("Total Cost: Rs."+order.calculateTotal());
    }
}