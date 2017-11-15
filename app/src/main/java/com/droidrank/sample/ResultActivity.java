package com.droidrank.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.droidrank.sample.controller.Controller;
import com.droidrank.sample.data.Data;
import com.droidrank.sample.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableLayout layout = (TableLayout) getLayoutInflater().inflate(R.layout.activity_result, null, false);
        setContentView(layout);

        int order = getIntent().getIntExtra("order", 3);

        Data data = new Data(order);
        View view = new View(layout);
        Controller controller = new Controller(data, view);
        controller.construct(this);
    }
}
