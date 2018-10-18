package com.maya.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view) {
        Toast toast = Toast.makeText(this, ":)", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countMe(View view) {
        TextView countTextView = findViewById(R.id.countTextView);
        String countString = countTextView.getText().toString();
        int countInt = Integer.parseInt(countString);
        countInt++;
        countTextView.setText(String.valueOf(countInt));
    }

    public void randomMe (View view) {

        Log.i("info maya", "random me");

        // Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        // Get the text view that shows the count.
        TextView showCountTextView = findViewById(R.id.countTextView);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert the count to an int
        int count = Integer.valueOf(countString);

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(TOTAL_COUNT, count);

        Log.i("info maya", "go to second activity");

        // Start the new activity.
        startActivity(randomIntent);
    }
}
