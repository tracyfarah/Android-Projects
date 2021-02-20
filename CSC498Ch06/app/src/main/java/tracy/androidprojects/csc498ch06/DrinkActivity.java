package tracy.androidprojects.csc498ch06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
    public static final String ITEM_NUMBER = "item_number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Intent intent = getIntent();
        int itemNumber = intent.getIntExtra(ITEM_NUMBER, 0);
        ImageView imageView = findViewById(R.id.item_image_view);
        TextView textViewName = findViewById(R.id.item_name_text_view);
        TextView textViewDesc = findViewById(R.id.item_description_text_view);

        imageView.setImageResource(Drink.drinks[itemNumber].getImageResourceId());
        textViewName.setText(Drink.drinks[itemNumber].getName());
        textViewDesc.setText(Drink.drinks[itemNumber].getDescription());
    }
}