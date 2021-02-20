package tracy.androidprojects.csc498ch03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOrder(View view) {
        EditText editTextName = findViewById(R.id.item_name_edit_text);
        EditText editTextQuantity = findViewById(R.id.item_quantity_edit_text);
        String itemName = editTextName.getText().toString();
        String itemQuantity = editTextQuantity.getText().toString();

        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(OrderActivity.ITEM_NAME, itemName);
        intent.putExtra(OrderActivity.ITEM_QUANTITY, itemQuantity);
        startActivity(intent);
    }

    public void onClickOrderExternally(View view) {
        EditText editTextName = findViewById(R.id.item_name_edit_text);
        EditText editTextQuantity = findViewById(R.id.item_quantity_edit_text);
        String itemName = editTextName.getText().toString();
        String itemQuantity = editTextQuantity.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, itemQuantity + " x " + itemName);
        startActivity(Intent.createChooser(intent, "Place order via: "));

       /* Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + "order@shop.com"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Online Order ");
        emailIntent.putExtra(Intent.EXTRA_TEXT, itemQuantity + " x " + itemName);
        //emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body);
        // If you are using HTML in your body text
        startActivity(Intent.createChooser(emailIntent, "Choose an Email client"));*/
    }
}