package com.depth.quran.radiobutton;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton iOS = (RadioButton) findViewById(R.id.selectIOS);
        iOS.setChecked(true);
        checkButtonClick();

    }

    private void checkButtonClick() {

        Button myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                //get selected radio button from radioGroup
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.osGroup);
                int selectedId = radioGroup.getCheckedRadioButtonId();

                //find the radio button by returned id
                RadioButton osButton = (RadioButton) findViewById(selectedId);

                StringBuffer responseText = new StringBuffer();
                responseText.append("The following Radio button is selected...\n");
                responseText.append(osButton.getText());

                TextView myTextView = (TextView) findViewById(R.id.responseText);
                myTextView.setText(responseText);

            }
        });

    }
}