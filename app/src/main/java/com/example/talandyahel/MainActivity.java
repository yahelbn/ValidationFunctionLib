package com.example.talandyahel;

import androidx.appcompat.app.AppCompatActivity;
import com.example.validationtext.ValidateFunctions;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private EditText editText;
        private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditText);
        button = findViewById(R.id.Button);

//
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFromUi=editText.getText().toString();
                Boolean bol=ValidateFunctions.emailIsValid(textFromUi);
                Toast.makeText(getApplicationContext(), "The string is: "+textFromUi, Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(), "The string is: "+bol, Toast.LENGTH_LONG).show();
//
            }
        });
    }
}