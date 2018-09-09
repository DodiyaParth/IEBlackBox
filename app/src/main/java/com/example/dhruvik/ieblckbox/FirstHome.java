package com.example.dhruvik.ieblckbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class FirstHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_home);

        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                 }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"somthing is wrong...",Toast.LENGTH_LONG).show();
                }finally {
                    startActivity(new Intent(getApplicationContext(),ProgressBar.class));
                }
            }
        });
        t.start();
    }
}
