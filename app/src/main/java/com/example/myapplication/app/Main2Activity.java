package com.example.myapplication.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
   private static Button button_sbmt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        OnclickButtonListener();
    }

    public void OnclickButtonListener(){
        button_sbmt = (Button)findViewById(R.id.button);
        button_sbmt.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                public void onClick(View v) {
                        Intent intentSecondActivity = new Intent("com.example.myapplication.app.Main2Activity");
                        startActivity(Intent);

                    }
                }
        );
    }
}
