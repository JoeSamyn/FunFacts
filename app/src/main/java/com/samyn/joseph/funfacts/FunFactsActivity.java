package com.samyn.joseph.funfacts;

import android.graphics.Color;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {
    // Declare view variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook = new FactBook();
    private RelativeLayout relativeLayout;
    private ColorWheel colorWheel = new ColorWheel();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding layout files
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factTextView.setText(factBook.GetFact());
                int colors = colorWheel.GetColor();
                relativeLayout.setBackgroundColor(colors);
                showFactButton.setTextColor(colors);
            }
        };
        showFactButton.setOnClickListener(listener);
        //Toast.makeText(this, "Yay! Our activity was created", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are logging from the OnCreate Method");

    }
}
