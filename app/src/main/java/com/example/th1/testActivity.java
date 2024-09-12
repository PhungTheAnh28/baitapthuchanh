package com.example.th1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class testActivity extends AppCompatActivity {
    private EditText edtA, edtB, edtKQ;
    private Button tong;
    private Button btn2Main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);
        tong = findViewById(R.id.tong);
        btn2Main = findViewById(R.id.btn2Main);

        btn2Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(testActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("data", "Xin chào Main");
                intent1.putExtra("mess", bundle);
                startActivity(intent1);
            }
        });

        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueA = edtA.getText().toString();
                String valueB = edtB.getText().toString();
            }
        });
    }
}
