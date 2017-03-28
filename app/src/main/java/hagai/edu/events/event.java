package hagai.edu.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class event extends AppCompatActivity {

    //define properties
    //in activities / controllers the properties are the controls
    private EditText etMessage;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        btnSend = (Button) findViewById(R.id.btnSend);
        etMessage = (EditText) findViewById(R.id.etMessage);


    }

    public void btnClicked(View view) {
        String text = etMessage.getText().toString();
        Toast.makeText(this, "Hello " +text, Toast.LENGTH_SHORT).show();
    }
}
