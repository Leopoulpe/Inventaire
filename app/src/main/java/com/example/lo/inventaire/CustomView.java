package com.example.lo.inventaire;

/**
 * Created by Léo on 13/10/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.lang.Object;

import android.graphics.BitmapFactory;



public class CustomView extends View implements View.OnTouchListener, View.OnClickListener{


    private Paint paint;

    private Bitmap bitmap;

    private Plateau plateau;

    public CustomView(Context context) {
        super(context);
        int x = 50;
        int y = 50;
        int sideLength = 200;
        plateau = new Plateau(10,10);
        init();

    }

    public void init(){
        this.isFocusable();
        this.isFocusableInTouchMode();
        this.setOnClickListener(this);

        this.setOnTouchListener(this);







    }

    @Override
    protected void onDraw(Canvas canvas) {
        for(int i = 0; i< plateau.getLong(); i++){
            for(int j = 0; j< plateau.getLarg(); j++) {
                if (plateau.getGrilleSole()[i][j].equals("HERBE")) {
                    bitmap = BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.herbe);
                } else if (plateau.getGrilleSole()[i][j].equals("ROCHE")) {
                    bitmap = BitmapFactory.decodeResource(this.getContext().getResources(),R.drawable.roche);
                }
                canvas.drawBitmap(bitmap, i * 64, j * 64, paint);


                if( plateau.getGrilleJoueur()[i][j]!=null){
                    bitmap = BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.joueur1);
                }
                canvas.drawBitmap(bitmap, i * bitmap.getWidth(), j * bitmap.getHeight(), paint);

            }
        }






    }

    public void setPlateau(Plateau p){
        this.plateau=p;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP)
        {
            double xClic = event.getX();
            double yClic = event.getY();

            int xTab =(int) xClic/64;
            int yTab =(int) yClic/64;

            //move
            plateau.getGrilleJoueur()[xTab][yTab]=plateau.getJoueur();
            plateau.getGrilleJoueur()[plateau.getJoueur().getX()][plateau.getJoueur().getY()]=null;

            plateau.getJoueur().setX(xTab);
            plateau.getJoueur().setY(yTab);

            System.out.println("touche en  "+xClic+" "+yClic);
            this.invalidate();
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        System.out.println("clic de base");
    }
}
