package com.example.dhruvik.ieblckbox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.victor.loading.book.BookLoading;

public class ProgressBar extends AppCompatActivity {

    TextView per;

    public void persent(int per1){
    }
    BookLoading bookLoading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_view);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        per = (TextView)this.findViewById(R.id.fg);


        bookLoading = (BookLoading)this.findViewById(R.id.bookLoad);
        bookLoading.start();

        try{
            Thread.sleep(3000);
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),"Somthing is wrong..",Toast.LENGTH_LONG).show();
        }finally {
            startActivity(new Intent(getApplicationContext(),Q1.class));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
