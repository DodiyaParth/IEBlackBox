package com.example.dhruvik.ieblckbox;

import android.content.Context;
import android.content.SharedPreferences;

public class Data {

    static public String q1_key="Q1";
    static public String q2_key="Q2";
    static public String q3_key="Q3";
    static public String q4_key="Q4";
    static public String q5_key="Q5";

    static int q1n,q2n,q3n,q4n,q5n;

    Context context;
    public Data(Context contet){
        this.context=contet;
    }
    SharedPreferences memory= context.getSharedPreferences("com.example.dhruvik.ieblckbox",Context.MODE_PRIVATE);


    public boolean valid(int i){
        if(i==1){
            if(memory.getInt(q1_key,0)==5)
                return false;
        }else if(i==2){
            if(memory.getInt(q2_key,0)==5)
                return false;
        }else if(i==3){
            if(memory.getInt(q3_key,0)==5)
                return false;
        }else if(i==4){
            if(memory.getInt(q4_key,0)==5)
                return false;
        }else{
            if(memory.getInt(q5_key,0)==5)
                return false;
        }
        return true;
    }


    public void setNoTry(int i){
        if(i==1){
            q1n=memory.getInt(q1_key,0)+1;
            memory.edit().putInt(q1_key,q1n).apply();
        }else if(i==2){
            q2n=memory.getInt(q2_key,0)+1;
            memory.edit().putInt(q2_key,q2n).apply();
        }else if(i==3){
            q3n=memory.getInt(q3_key,0)+1;
            memory.edit().putInt(q3_key,q3n).apply();
        }else if(i==4){
            q4n=memory.getInt(q4_key,0)+1;
            memory.edit().putInt(q4_key,q4n).apply();
        }else{
            q5n=memory.getInt(q5_key,0)+1;
            memory.edit().putInt(q5_key,q5n).apply();
        }
    }

    public int getNoTry(int i){
        if(i==1){
            return memory.getInt(q1_key,0);
        }else if(i==2){
            return memory.getInt(q2_key,0);
        }else if(i==3){
            return memory.getInt(q3_key,0);
        }else if(i==4){
            return memory.getInt(q4_key,0);
        }else{
            return memory.getInt(q5_key,0);
        }
    }


}
