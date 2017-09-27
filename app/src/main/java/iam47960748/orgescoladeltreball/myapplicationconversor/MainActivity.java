package iam47960748.orgescoladeltreball.myapplicationconversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private EditText euros;

    private EditText dolars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        euros = (EditText) findViewById(R.id.euro);

        dolars = (EditText) findViewById(R.id.dolar);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_LONG).show();

                doConversion();
            }

        });
    }
    private void doConversion(){

        double eurosC = Double.parseDouble(euros.getText().toString());

        double dolarsC = eurosC*1.17;

        dolars.setText(String.valueOf(dolarsC));

        //dolars.setText(Sting.valueOf(dolarsC));
    }
}
