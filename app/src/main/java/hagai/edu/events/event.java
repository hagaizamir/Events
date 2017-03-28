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
    private Button btnPlus;
    private Button btnMinus;
    private TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exc1);

//        btnSend = (Button) findViewById(R.id.btnSend);
//        etMessage = (EditText) findViewById(R.id.etMessage);
        (btnMinus) = (Button) findViewById(R.id.btnMinus);
        (btnPlus) = (Button) findViewById(R.id.btnPlus);
        (tvResults) = (TextView) findViewById(R.id.tvResults);


    }

    public void btnClicked(View view) {
//        String text = etMessage.getText().toString();
//        Toast.makeText(this, "Hello " +text, Toast.LENGTH_SHORT).show();
    }

    public void btnMinus(View view) {
        String text = tvResults.getText().toString();
    }

    public void btnPlus(View view) {
        String text = tvResults.getText().toString();
    }
}
