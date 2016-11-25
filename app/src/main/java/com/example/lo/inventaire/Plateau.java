package com.example.lo.inventaire;

/**
 * Created by Léo on 13/10/2016.
 */


public class Plateau {
    private int L;
    private int l;
    private Joueur[][] GrilleJoueur;
    private int[][] GrilleChemin;
    private int[][] GrilleZone;
    private String[][] GrilleSole;

    private Joueur joueur;

    public Plateau(int longueur, int largeur){
        setLong(longueur);
        setLarg(largeur);
        setGrilleJoueur(new Joueur[L][l]);

        setGrilleChemin(new int[L][l]);
        setGrilleZone(new int[L][l]);
        setGrilleSole(new String[L][l]);



        initGrilleSole();
        initGrilleJoueur();

    }

    public void initGrilleJoueur(){
        setJoueur(new Joueur(new Perso("Bob",10,2),5,5));
        getGrilleJoueur()[joueur.getX()][joueur.getY()]= getJoueur();
    }

    public void initGrilleSole(){
        for(int i = 0; i< L; i++){
            for(int j = 0; j< l; j++){
                getGrilleSole()[i][j]="HERBE";
            }
        }
        GrilleSole[5][5]="ROCHE";
        GrilleSole[5][6]="ROCHE";
        GrilleSole[5][7]="ROCHE";
    }

    public void initGrilleZone(int X, int Y,int pmm){

        int x=X;
        int y=Y;
        int pm=pmm;

        getGrilleZone()[x][y]=1;
        if(pm>0){
            if(y+1<= L -1)
                initGrilleZone(x,y+1,pm-1);
            if(y-1>=0)
                initGrilleZone(x,y-1,pm-1);
            if(x+1<= l -1)
                initGrilleZone(x+1,y,pm-1);
            if(x-1>=0)
                initGrilleZone(x-1,y,pm-1);

        }
    }

    public void calculGrilleZone(int X, int Y,int pmm){
        int x=X;
        int y=Y;
        int pm=pmm;
        getGrilleZone()[x][y] =1;
        if(pm>0){

            if(y+1<= L -1)
                calculGrilleZone(x,y+1,pm-1);
            if(y-1>=0)
                calculGrilleZone(x,y-1,pm-1);
            if(x+1<= l -1)
                calculGrilleZone(x+1,y,pm-1);
            if(x-1>=0)
                calculGrilleZone(x-1,y,pm-1);


        }
    }

    public int getLong() {
        return L;
    }

    public void setLong(int lo) {
        L = lo;
    }

    public int getLarg() {
        return l;
    }

    public void setLarg(int la) {
        l = la;
    }


    public int[][] getGrilleChemin() {
        return GrilleChemin;
    }

    public void setGrilleChemin(int[][] grilleChemin) {
        GrilleChemin = grilleChemin;
    }

    public int[][] getGrilleZone() {
        return GrilleZone;
    }

    public void setGrilleZone(int[][] grilleZone) {
        GrilleZone = grilleZone;
    }

    public String[][] getGrilleSole() {
        return GrilleSole;
    }

    public void setGrilleSole(String[][] grilleSole) {
        GrilleSole = grilleSole;
    }

    public Joueur[][] getGrilleJoueur() {
        return GrilleJoueur;
    }

    public void setGrilleJoueur(Joueur[][] grilleJoueur) {
        GrilleJoueur = grilleJoueur;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
}
