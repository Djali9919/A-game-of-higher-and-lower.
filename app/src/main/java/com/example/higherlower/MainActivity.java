package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int rand(){
        Random r = new Random();
        int n = r.nextInt(19) +1;
        return n;
    }
    int n = rand();
    public void onClick(View v){
        EditText et = (EditText) findViewById(R.id.editText);
        String s = et.getText().toString();
        int i = Integer.parseInt(s);
        if(i<n){
            Toast.makeText(this, "Higher", Toast.LENGTH_LONG).show();
        }
        else if (i>n){
            Toast.makeText(this, "Lower", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Gotcha", Toast.LENGTH_LONG).show();
            n = rand();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
