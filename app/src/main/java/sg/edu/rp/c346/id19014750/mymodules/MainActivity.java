package sg.edu.rp.c346.id19014750.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnC322;
    Button btnC346;
    Button btnC384;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC322 = findViewById(R.id.buttonC322);
        btnC346 = findViewById(R.id.buttonC346);
        btnC384 = findViewById(R.id.buttonC384);

        btnC322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("select", "C322");
                startActivity(intent);
            }
        });

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("select", "C346");
                startActivity(intent);
            }
        });

        btnC384.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("select", "C384");
                startActivity(intent);
            }
        });

    }
}