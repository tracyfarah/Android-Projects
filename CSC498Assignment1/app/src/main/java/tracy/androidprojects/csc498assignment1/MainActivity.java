package tracy.androidprojects.csc498assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCalculatePerimeterAndArea(View view) {
        EditText editTextLength = findViewById(R.id.length_edit_text);
        EditText editTextWidth = findViewById(R.id.width_edit_text);
        int length = Integer.parseInt(String.valueOf(editTextLength.getText()));
        int width = Integer.parseInt(String.valueOf(editTextWidth.getText()));
        int perimeter = 2 * (length + width);
        int area = length * width;
        TextView results = findViewById(R.id.results_text_view);
        results.setText("Perimeter : " + perimeter + " \nArea: " + area);
    }
}