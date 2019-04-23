package com.stechapps.animationtrials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TypeWriter extends AppCompatActivity {
    private TypeWriterView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_writer);

        tw = (TypeWriterView) findViewById(R.id.tv);

    }

    public void startTyping(View view) {
        tw.setText("");
        tw.setCharacterDelay(150);
        EditText ed=findViewById(R.id.typrWriter_Enter_text);
        tw.animateText(ed.getText().toString().trim());
    }
}
