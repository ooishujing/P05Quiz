package sg.edu.rp.c346.p05_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDecrease;
    Button btnIncrease;
    Button btnSubmit;
    CheckBox checkBoxOneWay;
    CheckBox checkBoxRoundTrip;
    TextView tvShowPax;
    TextView tvShowDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDecrease = findViewById(R.id.buttonDecrease);
        btnIncrease = findViewById(R.id.buttonIncrease);
        btnSubmit = findViewById(R.id.button3);
        checkBoxOneWay = findViewById(R.id.checkBox);
        checkBoxRoundTrip = findViewById(R.id.checkBox2);
        tvShowPax = findViewById(R.id.quantity);
        tvShowDetails = findViewById(R.id.paxCost);

        double pax = tvShowPax;


        while(checkBoxOneWay.isChecked() || checkBoxRoundTrip.isChecked() ) {
            if (checkBoxOneWay.isChecked()){
                double cost=100*pax;
                tvShowDetails.setText("Your air ticket costs $" + cost);
            }else{
                double cost=100*pax*2;
                tvShowDetails.setText("Your air ticket costs $" + cost);
            }

        }



        btnDecrease.setOnClickListener(new

        );

    }
}
