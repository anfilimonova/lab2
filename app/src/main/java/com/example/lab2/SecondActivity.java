package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // кнопка ответа
        Button button = (Button) findViewById(R.id.AnsButton);
        button.setOnClickListener(v ->
        {
            EditText text = (EditText) findViewById(R.id.answerInfo);
            Intent intent = new Intent();
            intent.putExtra("answerData",text.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        });

        // ответ
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            String value = extras.getString("cardData");
            TextView tv = (TextView) findViewById(R.id.InfoSended);
            tv.setText(value);
        }
    }
}