package tracy.androidprojects.csc498ch03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    public static final String ITEM_NAME = "name_of_item";
    public static final String ITEM_QUANTITY = "quantity_of_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String itemName = intent.getStringExtra(ITEM_NAME);
        String itemQuantity = intent.getStringExtra(ITEM_QUANTITY);

        StringBuilder orderSummary = new StringBuilder("Order: ");
        orderSummary.append(itemQuantity).append(" x ").append(itemName);

        //Display as a Toast
        Toast.makeText(this, orderSummary, Toast.LENGTH_LONG).show();

        //Display in the TextView
        TextView textView = findViewById(R.id.order_summary_text_view);
        textView.setText(orderSummary);
    }
}