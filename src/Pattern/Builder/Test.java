package Pattern.Builder;

/**
 * Created by fly on 2018/3/7.
 */
public class Test {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.perpareVegMeal();
        System.err.println("Veg Meal");
        vegMeal.showItems();
        System.err.println("Total Cost : " + vegMeal.getCost());


        Meal nonMeal = mealBuilder.prepareNonVegMeal();
        System.err.println("\n\nNon-Veg Meal");
        nonMeal.showItems();
        System.err.println("Total Cost : " + nonMeal.getCost());
    }
}
