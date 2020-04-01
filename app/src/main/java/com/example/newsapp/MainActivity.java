package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * The {@link MainActivity} class serves as the starting point to the News application
 * It is selected as the launch Activity and contains button sending an intent to open
 * NewsActivity
 */
public class MainActivity extends AppCompatActivity {

    /** Declaring a button object that will hold the reference to the ButtonView in the activity_main layout*/
    private Button nButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the reference to the {@link Button} in the activity_main layout.
        nButton = findViewById(R.id.button_next_activity);

        // Setting an {@link OnClickListener} on the @param nButton,
        // declaring an anonymous {@link View.OnClickListener} class,
        // implementing the onClick method from the interface
        // and starting the NewsActivity via Intent.
        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewsActivity.class));
            }
        });
    }
}
