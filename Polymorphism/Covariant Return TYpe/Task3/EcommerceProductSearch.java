// Scenario 3: E-commerce Product Search
// In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.

/**
 * InnerEcommerceProductSearch
 */

class Product {
    Product search() {
        System.out.println("\n Searching for Products.");
        return this;
    }
}

class ElectronicsProduct extends Product {
   @Override
    ElectronicsProduct search() {

        System.out.println("Electronics Product is Available in Store!!");
        return this;
    }
}
class ClothingProduct extends Product {
    @Override
    ClothingProduct search() {
        
        System.out.println("Cloths are Available in Store!!");
        return this;
    }
}
public class EcommerceProductSearch {
    public static void main(String[] args) {
        Product p;

        p = new Product();
        p.search();
        
        p = new ElectronicsProduct();
        p.search();

        p = new ClothingProduct();
        p.search();
    }
}
