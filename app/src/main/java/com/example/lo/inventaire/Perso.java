package com.example.lo.inventaire;

/**
 * Created by Léo on 13/10/2016.
 */
import java.util.ArrayList;

public class Perso {
    private String nom;
    private int pv;
    private int pm;
    private ArrayList<Technique> list_technique;

    public Perso(){
        setPv(1);
        list_technique = new ArrayList<Technique>();
    }

    public Perso(String n,int pv, int pm){
        this.setNom(n);
        this.setPv(pv);
        this.setPm(pm);
        list_technique = new ArrayList<Technique>();
    }

    public Perso(int pv){
        this.setPv(pv);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
