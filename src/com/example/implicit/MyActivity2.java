package com.example.implicit;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by g00238234 on 21/10/2015.
 */
public class MyActivity2 extends Activity{

EditText et;
    EditText et2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        et = (EditText) findViewById(R.id.edit1);
        et2 = (EditText) findViewById(R.id.edit2);

        Uri uri = getIntent().getData();

        String num1 = uri.getQueryParameter("num1");
        String num2 = uri.getQueryParameter("num2");

        double num = Double.parseDouble(num1);
        double numb = Double.parseDouble(num2);

        double total = num+numb;

        et.setText("total " + total);

    }

}
