package com.github.coyclab.discounthunter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.coyclab.discounthunter.R;
import com.github.coyclab.discounthunter.loaders.ProductListLoader;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button loadData = (Button) findViewById(R.id.load_data_button);
        loadData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new ProductListLoader().execute(getApplicationContext());
            }
        });

        Date date = new Date(1505174400000L);
    }
}
