package com.manycat.www.interfacetextsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Main2Activity.DataClickListener{

    private EditText txt1;

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText)findViewById(R.id.txt1);

        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain2 = new Intent( MainActivity.this, Main2Activity.class);
                startActivity(intentMain2);
            }
        });

        Main2Activity.setListener(this);
    }

    @Override
    public void onDataClickListener(String s) {
        txt1.setText(s);
    }
}
