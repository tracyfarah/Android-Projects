package tracy.androidprojects.csc498ch02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    CoffeeExpert coffeeExpert = new CoffeeExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLickRecommendCoffee(View view) {
        Spinner coffeePreference = findViewById(R.id.preference_spinner);
        String coffeeDescription = String.valueOf(coffeePreference.getSelectedItem());
        List<String> coffeeExpertRecommendation = coffeeExpert.getRecommendation(coffeeDescription);
        StringBuilder recommendations = new StringBuilder();
        for (String recommendation : coffeeExpertRecommendation) {
            recommendations.append(recommendation).append("\n");
        }
        TextView coffeeRecommendation = findViewById(R.id.recommendation_text_view);
        coffeeRecommendation.setText(recommendations.toString());
    }

}