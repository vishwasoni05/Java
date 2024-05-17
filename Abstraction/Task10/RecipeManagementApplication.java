// Scenario 10: Recipe Management Application
// Create an abstract class called "Recipe" with abstract methods like "prepareIngredients" and "cook." Implement derived classes like "SoupRecipe" and "DessertRecipe" that provide specific implementations for these abstract methods.


abstract class Recipe {
    String dish_name;
    String recipe_name;

    Recipe(String recipe_name, String dish_name) {
        this.dish_name = dish_name;
        this.recipe_name = recipe_name;
    }

    void display() {
        System.err.println("\n"+recipe_name);
        
    }

    abstract void prepareIngredients();

    abstract void cook();
}

class SoupRecipe extends Recipe {

    SoupRecipe(String recipe_name, String dish_name) {
        super(recipe_name, dish_name);
    }

    @Override
    void prepareIngredients() {
        System.out.println("Preparing ingrediants for making " + super.dish_name);
    }

    @Override
    void cook() {
        System.out.println("Cooking the " + super.dish_name);
    }

}

class DessertRecipe extends Recipe {
    
    DessertRecipe(String recipe_name, String dish_name) {
        super(recipe_name, dish_name);
    }

    @Override
    void prepareIngredients() {
        System.out.println("Preparing ingrediants for making " + super.dish_name);
    }
    
    @Override
    void cook() {
        System.out.println("Cooking the "+super.dish_name);
    }

    
}
public class RecipeManagementApplication {
    public static void main(String[] args) {
        SoupRecipe s = new SoupRecipe("SoupRecipe", "Hot and Sour");
        s.display();
        s.prepareIngredients();
        s.cook();

        DessertRecipe d = new DessertRecipe("DessertRecipe", "ChoclateBrownie");
        d.display();
        d.prepareIngredients();
        d.cook();
    }
}
