package com.example.dhruvik.ieblckbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q1 extends AppCompatActivity {


    Button next, prev,check;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        initiallize();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Q2.class));
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Q5.class));
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.valid(1)){

                }else {
                    //you chance is over.....
                }
            }
        });
    }

    private void initiallize() {
        next = (Button) this.findViewById(R.id.nxt);
        prev = (Button) this.findViewById(R.id.prev);
        check=(Button)this.findViewById(R.id.check);
        data=new Data(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    public void tryCount(){

    }

}
