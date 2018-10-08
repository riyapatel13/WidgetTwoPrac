package com.example.a10016322.widgettwoprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView title;
    RadioGroup radioGroup;
    RadioButton harry, hermione, ron;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView)(findViewById(R.id.textView_id));
        radioGroup = (RadioGroup)(findViewById(R.id.radiogroup_id));
        harry = (RadioButton)(findViewById(R.id.radioButton_id));
        hermione = (RadioButton)(findViewById(R.id.radioButton2_id));
        ron = (RadioButton)(findViewById(R.id.radioButton3_id));
        image = (ImageView)(findViewById(R.id.imageView_id));

        image.setImageResource(R.drawable.harrypotter);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton_id) {
                    image.setImageResource(R.drawable.harry);
                    Toast message = Toast.makeText(MainActivity.this, "You have picked Harry", Toast.LENGTH_SHORT);
                    message.show();
                }
                else if(checkedId == R.id.radioButton2_id){
                    image.setImageResource(R.drawable.hermione);
                    Toast message = Toast.makeText(MainActivity.this, "You have picked Hermione", Toast.LENGTH_SHORT);
                    message.show();
                }
                else if(checkedId == R.id.radioButton3_id) {
                    image.setImageResource(R.drawable.ron);
                    Toast message = Toast.makeText(MainActivity.this, "You have picked Ron", Toast.LENGTH_SHORT);
                    message.show();
                }
            }
        });
    }
}
