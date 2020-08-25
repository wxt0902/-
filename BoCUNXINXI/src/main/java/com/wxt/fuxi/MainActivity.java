package com.wxt.fuxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.service.autofill.FillCallback;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit_one);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String inputText=editText.getText().toString().trim();
        save(inputText);
    }
    public void save(String inputText){
        FileOutputStream out=null;
        BufferedWriter writer=null;

        try {
          out=openFileOutput("date",Context.MODE_PRIVATE);
          writer=new BufferedWriter(new OutputStreamWriter(out));
          writer.write(inputText);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!=null){
                    writer.close();o
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}