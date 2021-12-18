package com.example.project_class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonCalcArea(View v)
    {

        Rectangle r;
        EditText ed1, ed2;
        TextView tv1;
        Double side1, side2, ans1;

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
        tv1 = (TextView)findViewById(R.id.tv1);
        side1 = Double.parseDouble(ed1.getText().toString());
        side2 = Double.parseDouble(ed2.getText().toString());
        r = new Rectangle(side1, side2);

        
        ans1 = r.calcArea();
        tv1.setText(String.valueOf(ans1));

    }




}