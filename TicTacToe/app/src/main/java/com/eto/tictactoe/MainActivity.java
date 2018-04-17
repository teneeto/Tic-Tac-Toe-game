package com.eto.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadLevelSelection(View view) {

        //Method is called whe buttons are tapped

        int id = view.getId();

        //The id is used to identify which button is tapped

        if(id == R.id.multiPlayerButton){
            //Toast.makeText(this, "MultiPlayer", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LevelSelectionActivity.class);
            intent.putExtra("mode","multi");
            startActivity(intent);
        }

    }

    public void loadAboutPage(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
