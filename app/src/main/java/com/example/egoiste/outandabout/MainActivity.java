package com.example.egoiste.outandabout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText storyIn;
    private Spinner a1;
    private Spinner a2;
    private Spinner a3;
    private Spinner a4;
    private TextView location;
    private Button subButton;

    private String valToSet;
    private String locationStr;
    private String storyStr;            //CLEAN UP THIS MESS :D
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //set the activity to main activity
        setTitle("Out and About");

        storyIn = (EditText) findViewById(R.id.story_input);  //get all the neccessary UI components
        location = (TextView) findViewById(R.id.location);
        a1 = (Spinner) findViewById(R.id.SpinnerAnswers);
        a2 = (Spinner) findViewById(R.id.SpinnerAnswers2);
        a3 = (Spinner) findViewById(R.id.SpinnerAnswers3);
        a4 = (Spinner) findViewById(R.id.SpinnerAnswers4);
        subButton = (Button) findViewById(R.id.submitionButton);

        locationStr=(String) location.getText();


    }

    public void subButtonClicked(View view){
        String ans1 = (String) a1.getSelectedItem();
        String ans2 = (String) a2.getSelectedItem();
        String ans3 = (String) a3.getSelectedItem();
        String ans4 = (String) a4.getSelectedItem();

        storyStr=storyIn.getText().toString();





        storyIn.setText(ans1.substring(0,1));

    }
}
