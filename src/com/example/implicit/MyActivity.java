package com.example.implicit;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity {

    private Button btn;
    EditText et;
    EditText et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        et = (EditText)findViewById(R.id.edit);
        et2 = (EditText)findViewById(R.id.edit2);


        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

               // Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("add://example.com/sum"));
                Editable loanAmount = et.getText();
                String num1=String.format("num1=%s",loanAmount);
                Editable num = et2.getText();
                String num2=String.format("num2=%s",num);
                String base = "add://example.com/sum";
                String address = String.format("%s?%s&%s",base,num1,num2);

                Uri uri = Uri.parse(address);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //intent.putExtras(bundler)
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
