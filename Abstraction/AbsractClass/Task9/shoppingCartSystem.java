// Scenario 9: Shopping Cart System
// Develop an abstract class called "CartItem" with abstract methods like "calculatePrice" and "displayDetails." Implement derived classes like "ElectronicsItem" and "ClothingItem" that provide specific implementations for these abstract methods.

abstract class CartItem {
    double e_price;
    double c_price;

    CartItem() {
        e_price = 20000;
        c_price = 2000;
    }
    abstract void calculatePrice();

    abstract void displayDetails();
}

class ElectronicsItem extends CartItem {
    String product_name;

    ElectronicsItem(String product_name) {
        this.product_name = product_name;
    }

    @Override
    void displayDetails() {
        System.out.println("\nElectronicsItem Store!!!");
        System.out.println("Product Name You want to buy:" + this.product_name);

    }

    @Override
    void calculatePrice() {
        System.out.println("Price of Product you want to buy:" + super.e_price);
    }
}

class ClothingItem extends CartItem {
    String product_name;

    ClothingItem(String product_name) {
        this.product_name = product_name;
    }

    @Override
    void displayDetails() {
        System.out.println("\nClothingItem Store!!!");
        System.out.println("Product Name You want to buy:" + this.product_name);

    }

    @Override
    void calculatePrice() {
        System.out.println("Price of Product you want to buy:" + super.c_price);
    }
}

public class shoppingCartSystem {
    public static void main(String[] args) {
        ElectronicsItem e = new ElectronicsItem("Phone");
        e.displayDetails();
        e.calculatePrice();

        ClothingItem c = new ClothingItem("Frock");
        c.displayDetails();
        c.calculatePrice();
    }
}
