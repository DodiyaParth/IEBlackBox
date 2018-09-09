package com.example.dhruvik.ieblckbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q4 extends AppCompatActivity {


    Button next, prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        initiallize();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Q5.class));
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Q3.class));
            }
        });
    }

    private void initiallize() {
        next = (Button) this.findViewById(R.id.nxt);
        prev = (Button) this.findViewById(R.id.prev);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
    public void startQ(int n) {
        if (n == 0) {
            startActivity(new Intent(getApplicationContext(),Q1.class));
        }else if(n==1){
            startActivity(new Intent(getApplicationContext(),Q2.class));
        }else if(n==2){
            startActivity(new Intent(getApplicationContext(),Q3.class));
        }else if(n==3){
            startActivity(new Intent(getApplicationContext(),Q4.class));
        }else{
            startActivity(new Intent(getApplicationContext(),Q5.class));
        }
    }

}
