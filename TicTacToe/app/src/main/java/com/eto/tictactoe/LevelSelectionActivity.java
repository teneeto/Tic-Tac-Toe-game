package com.eto.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LevelSelectionActivity extends AppCompatActivity {

    private Bundle extras;
    private String mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);

        extras = getIntent().getExtras();

        mode = extras.getString("mode").toString();

        //Toast.makeText(this, mode, Toast.LENGTH_SHORT).show();
    }

    public void loadGameActivty(View view) {
        int id = view.getId();

        if(id == R.id.threebythree){
            if(mode.equals("single")){
            }else if(mode.equals("multi")){
                //Toast.makeText(this, "3x3", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Multi3x3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }
    }
}
