package com.example.th1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private Button btnSwitch;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        btnSwitch = findViewById(R.id.btnSwitch);


        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, testActivity.class);
                startActivity(intent1);

            };
});
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("mess");
    if (bundle != null) {
        String data = bundle.getString("data");
        if (data != null) {

            Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
        }
    }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToDisplay = textView.getText().toString();
                if (textToDisplay.isEmpty()) {

                    Toast.makeText(MainActivity.this, "Text view is empty!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, textToDisplay, Toast.LENGTH_SHORT).show();
                }
            }
        });


        button.setOnClickListener(view -> {
            String message = textView.getText().toString();
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });
    }
}