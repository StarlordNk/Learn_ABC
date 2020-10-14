package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        setText();
    }

    static int as,range;
    private int arr[]={7,8,9,12,13,36,44,46,47};
    boolean contains(int n) {
        if (range == 26)
            return false;
        if (range == 35)
        {       if (n == 2 || n == 25)
                return true;
            else
                return false;
        }
        for(int i:arr)
            if(i==n)
                return true;
        return false;
    }
    //int 2524, 2525 ,2527;
    protected void setText(){
        TextView t=(TextView) findViewById(R.id.text);
        t.setText(""+(char)as);
    }
    Random r= new Random();
    private int pre=-1;
    public void changeAlpha(View view){
        TextView t = findViewById(R.id.text);
        int a=pre;
        while(a==pre|| contains(a)) {
            a = r.nextInt(range);
        }
        pre=a;
        t.setText(""+(char)(a+as));
    }
}