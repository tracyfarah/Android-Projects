package tracy.androidprojects.csc498ch02netflix;

import java.util.ArrayList;
import java.util.List;

public class NetflixRecommendations {

    List<String> recommendMovie(String preference) {
        List<String> recommendations = new ArrayList<>();
        if (preference.equals("Action")) {
            recommendations.add("American Assassin");
            recommendations.add("Fast and Furious");
            recommendations.add("The Hitman's Bodyguard");
        } else if (preference.equals("Anime")) {
            recommendations.add("Pokemon the Series");
            recommendations.add("Attack on Titan");
            recommendations.add("The Seven Deadly Sins");
        } else if (preference.equals("Children & Family")) {
            recommendations.add("Despicable Me");
            recommendations.add("The Smurfs");
            recommendations.add("Shrek");
        } else if (preference.equals("Comedy")) {
            recommendations.add("Brooklyn 99");
            recommendations.add("Jumanji");
            recommendations.add("Johnny English");
        } else if(preference.equals("Fantasy")) {
            recommendations.add("Teen Wolf");
            recommendations.add("Fate: The Winx Saga");
            recommendations.add("The Vampire Diaries");
        } else if(preference.equals("Horror")) {
            recommendations.add("Truth or Dare");
            recommendations.add("IT");
            recommendations.add("The Babysitter");
        } else if(preference.equals("Romance")) {
            recommendations.add("To All the Boys");
            recommendations.add("The Kissing Booth");
            recommendations.add("The Notebook");
        }
        return recommendations;
    }
}
