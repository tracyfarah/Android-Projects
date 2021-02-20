package tracy.androidprojects.csc498ch02netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    NetflixRecommendations netflixRecommendations = new NetflixRecommendations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRecommendMovie (View view){
        TextView netflixRecommendation = findViewById(R.id.recommendations_text_view);
        Spinner movieGenre = findViewById(R.id.options_spinner);
        String moviePreference = String.valueOf(movieGenre.getSelectedItem());
        List<String> recommendation_list = netflixRecommendations.recommendMovie(moviePreference);
        StringBuilder recommendations = new StringBuilder();
        for(String recommendation : recommendation_list){
            recommendations.append(recommendation).append("\n");
        }
        netflixRecommendation.setText(recommendations);
    }
}