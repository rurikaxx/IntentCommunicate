package com.manycat.www.interfacetextsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText txt2;

    private Button btn2;

    private static DataClickListener dataClickListener;

    public interface DataClickListener {
        void onDataClickListener(String s);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt2 = (EditText)findViewById(R.id.txt2);

        btn2 = (Button)findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataClickListener.onDataClickListener(txt2.getText().toString());
            }
        });
    }

    public static void setListener(DataClickListener listener) {
        dataClickListener = listener;
    }
}
