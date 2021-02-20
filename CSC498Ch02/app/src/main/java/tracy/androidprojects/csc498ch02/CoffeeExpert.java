package tracy.androidprojects.csc498ch02;

import java.util.ArrayList;
import java.util.List;

public class CoffeeExpert {

    List<String> getRecommendation(String preference) {
        List<String> recommendation = new ArrayList<>();
        if (preference.equals("Strongest")) {
            recommendation.add("Ristretto");
            recommendation.add("Doppio");
            recommendation.add("Espresso");
        } else if (preference.equals("Bitter and Black")) {
            recommendation.add("French Press");
        } else if (preference.equals("Weak and Black")) {
            recommendation.add("American Coffee");
            recommendation.add("Americano");
        } else if (preference.equals("With Milk")) {
            recommendation.add("Cappuccino");
            recommendation.add("Espresso Macchiato");
        } else if (preference.equals("Lots of Milk")) {
            recommendation.add("Caffè Latte");
            recommendation.add("Caffè au Lait");
        } else if (preference.equals("Chocolate and Milk")) {
            recommendation.add("Caffè Mocha");
            recommendation.add("Mochacccino");
        } else if (preference.equals("No Caffeine")) {
            recommendation.add("Decaf");
        }
        return recommendation;
    }

}
