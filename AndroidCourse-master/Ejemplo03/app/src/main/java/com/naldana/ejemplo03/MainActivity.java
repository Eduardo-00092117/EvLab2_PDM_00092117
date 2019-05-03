package com.naldana.ejemplo03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mNameEditText;
    private TextView mDisplayNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = findViewById(R.id.et_name);
        mDisplayNameTextView = findViewById(R.id.tv_display_name);
    }


    public void displayName(View v){
        String name = mNameEditText.getText().toString();

        if(name.isEmpty()) {
            mDisplayNameTextView.setText(R.string.hint_text_instrucction_name);
        } else {
            mDisplayNameTextView.setText(name);
        }

    }
}
