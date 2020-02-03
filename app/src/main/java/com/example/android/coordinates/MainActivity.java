package com.example.android.coordinates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUGTAG = "ABD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addTouchListener();

    }

    private void addTouchListener() {


        ImageView img=findViewById(R.id.img1);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                float x=event.getX();
                float y=event.getY();

                String text = "You click at x = " + event.getX() + " and y = " + event.getY();
               Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();


              //  Log.d(MainActivity.DEBUGTAG,text);
                return false;
            }
        });
    }
}
