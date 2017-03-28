package hagai.edu.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class event extends AppCompatActivity {

    //define properties
    //in activities / controllers the properties are the controls
//    private EditText etMessage;
//    private Button btnSend;
    private RadioGroup rgTemperature;
    private TextView tvResults;
    private EditText etTemperature;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp_converter);


        (rgTemperature) = (RadioGroup) findViewById(R.id.rgTemperature);
        (tvResults) = (TextView) findViewById(R.id.tvResults);
        (etTemperature) = (EditText) findViewById(R.id.etTemperature);

    }




    private void setTvResults (){

    }

    public void btnCalc(View view) {
        try {
            int checkedID = rgTemperature.getCheckedRadioButtonId();
            double results = 0;
            double temp = Double.valueOf(etTemperature.getText().toString());
            if (checkedID==R.id.radioCelsius){
                //T(°F) = T(°C) × 9/5 + 32
                results = (temp-32)*5.0/9;

            }
            else {
               // T(°C) = (T(°F) - 32) / (9/5)
                results = temp*9.0/5 +32;
            }
            tvResults.setText(String.valueOf(results));
        } catch (NumberFormatException e) {

        }
    }


    }

