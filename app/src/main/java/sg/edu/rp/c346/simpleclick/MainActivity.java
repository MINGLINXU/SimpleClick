package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton toggleButtonEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_part1);


        //Step 2: Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.editTextInput);
        toggleButtonEnabled=findViewById(R.id.toggleButtonEnabled);

        toggleButtonEnabled.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Add your code for the action
                if (toggleButtonEnabled.isChecked()){
                    etInput.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                }
            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Code for the action

                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);


            }
        });
    }
}
