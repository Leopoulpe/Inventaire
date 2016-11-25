package com.example.lo.inventaire;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;



public class Dessin extends AppCompatActivity {
    private ImageView image;
    private Bitmap bitmap;


    /*public void init(){



        image.isFocusableInTouchMode();
        image.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                System.out.println("clic!!!!");
            }

        });
        image.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP)
                {
                    double xClic = event.getX();
                    double yClic = event.getY();

                    System.out.println("clic en  "+xClic+" "+yClic);

                }
                return false;
            }


        });



    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CustomView(this));


    }
    //Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_LONG).show();




    /*public boolean onTouchEvent(MotionEvent event)
    {
        //---quand on clique sur l'écran ---
        if (event.getAction() == MotionEvent.ACTION_UP)
        {
            double xClic = event.getX();
            double yClic = event.getY();
            //Toast.makeText(getBaseContext(),"x = " +String.valueOf(xClic) + "," + "  y = " +String.valueOf(yClic) ,Toast.LENGTH_SHORT).show();
            System.out.println("clic en  "+xClic+" "+yClic);
        }
        return false;
    }*/

}
