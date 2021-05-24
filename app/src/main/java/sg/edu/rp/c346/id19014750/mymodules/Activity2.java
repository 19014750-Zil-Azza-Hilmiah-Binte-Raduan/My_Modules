package sg.edu.rp.c346.id19014750.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView modDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        modDetail = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String btnSelected = intentReceived.getStringExtra("select");

        if(btnSelected.equalsIgnoreCase("C322")){
            String detail = "Module Code: C322\n" +
                    "Module Name: Data Centre and Cloud Management\n" +
                    "Academic Year: 2021\n" +
                    "Semester: 1\n" +
                    "Module Credit: 4\n" +
                    "Venue: E61G";
            modDetail.setText(detail);
        }
        else if(btnSelected.equalsIgnoreCase("C346")){
            String detail = "Module Code: C346\n" +
                    "Module Name: Mobile App Development\n" +
                    "Academic Year: 2021\n" +
                    "Semester: 1\n" +
                    "Module Credit: 4\n" +
                    "Venue: E62E";
            modDetail.setText(detail);
        }
        else if(btnSelected.equalsIgnoreCase("C384")){
            String detail = "Module Code: C384\n" +
                    "Module Name: IT Service Delivery\n" +
                    "Academic Year: 2021\n" +
                    "Semester: 1\n" +
                    "Module Credit: 4\n" +
                    "Venue: E62G";
            modDetail.setText(detail);
        }

    }
}