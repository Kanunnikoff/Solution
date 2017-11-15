package com.droidrank.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.droidrank.sample.controller.Controller;
import com.droidrank.sample.data.Data;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText orderEditText = (EditText) findViewById(R.id.orderEditText);

        findViewById(R.id.okButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("".equals(orderEditText.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Order must be a number!", Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("order", Integer.valueOf(orderEditText.getText().toString()));
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
