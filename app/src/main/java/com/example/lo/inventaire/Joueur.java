package com.example.lo.inventaire;

/**
 * Created by Léo on 14/10/2016.
 */

public class Joueur {
    private Perso perso;
    private int X;
    private int Y;
    private int pv;
    private int pm;

    public Joueur(Perso p,int x, int y){
        setPerso(p);
        setX(x);
        setY(y);
        setPv(getPerso().getPv());
        setPm(getPerso().getPm());
    }

    public Perso getPerso() {
        return perso;
    }

    public void setPerso(Perso perso) {
        this.perso = perso;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPm() {
        return pm;
    }

    public void setPm(int pm) {
        this.pm = pm;
    }
}
