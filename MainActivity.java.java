package com.zubayer.calcu;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextView.OnClickListener {
    @Override
    public void onClick(View v) {

        String s1= e1.getText().toString();
        String s2= e2.getText().toString();

        Double d1= Double.parseDouble(s1);
        Double d2= Double.parseDouble(s2);


        switch(v.getId()){
            case R.id.plus:
                double res=d1+d2;
                tv.setText(String.valueOf(res));
                break;
            case R.id.min:
                double res1=d1+d2;
                tv.setText(String.valueOf(res1));
                break;
            case R.id.mul:
                double res2=d1+d2;
                tv.setText(String.valueOf(res2));
                break;
            case R.id.div:
                double res3=d1+d2;
                tv.setText(String.valueOf(res3));
                break;

        }

    }

    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.e1);
        e2= (EditText) findViewById(R.id.e2);

        b1= (Button) findViewById(R.id.plus);
        b2= (Button) findViewById(R.id.min);
        b3= (Button) findViewById(R.id.mul);
        b4= (Button) findViewById(R.id.div);

        tv= (TextView) findViewById(R.id.tv);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }
}
