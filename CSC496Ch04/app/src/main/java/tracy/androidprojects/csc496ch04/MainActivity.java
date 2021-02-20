package tracy.androidprojects.csc496ch04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ticks = 0;
    boolean running = false;
    boolean wasRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            ticks = savedInstanceState.getInt("ticks");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }

    // If the activity is destroyed, example due to rotation,
    // we will save the class attributes as Bundle object
    // Bundle outState becomes Bundle savedInstanceState
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("ticks", ticks);
        outState.putBoolean("running", running);
        outState.putBoolean("wasRunning", wasRunning);
        super.onSaveInstanceState(outState);
    }

    //If it was running before it went into background, resume running
    @Override
    protected void onStart() {
        super.onStart();
        if (wasRunning) {
            running = true;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    //If it goes to background, stop the counter till it is in foreground again
    @Override
    protected void onStop() {
        super.onStop();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void runTimer() {
        TextView textView = findViewById(R.id.time_passed_text_view);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (running) {
                    ticks++;
                }
                // ticks = 3750 => 1:02:30
                int seconds = ticks % 60;
                int minutes = ticks / 60 % 60;
                int hours = ticks / 3600;
                String stringToDisplay = String.format("%d:%02d:%02d", hours, minutes, seconds);
                textView.setText(stringToDisplay);
                handler.postDelayed(this, 1000);
            }
        });
    }

    //button methods
    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
    }

    public void onClickReset(View view) {
        running = false;
        ticks = 0;
    }
}