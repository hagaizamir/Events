package hagai.edu.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class event extends AppCompatActivity {

    //define properties
    //in activities / controllers the properties are the controls
//    private EditText etMessage;
//    private Button btnSend;

    private TextView tvResults;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exc1);

//        btnSend = (Button) findViewById(R.id.btnSend);
//        etMessage = (EditText) findViewById(R.id.etMessage);

        (tvResults) = (TextView) findViewById(R.id.tvResults);
        setTvResults();


    }

    public void btnClicked(View view) {
//        String text = etMessage.getText().toString();
//        Toast.makeText(this, "Hello " +text, Toast.LENGTH_SHORT).show();
    }

    public void btnMinus(View view) {
//        String text = tvResults.getText().toString();
        counter--;
        setTvResults();
    }

    public void btnPlus(View view) {
       counter++;
        setTvResults();
    }
    private void setTvResults (){
        tvResults.setText(String.valueOf(counter));

    }
}
