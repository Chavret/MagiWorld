package com.company.models;

public class Rodeur extends Personnage {

    public Rodeur(int niveau, int force, int agilite, int intelligence, int playerNumber) {
        super(niveau, force, agilite, intelligence, playerNumber);
    }

    // PUBLIC
    @Override
    public void basicAttack(Personnage p) {
        System.out.println("Joueur " + getPlayerNumber() + " utilise Tir à l'Arc et inflige " + getAgilite() + " dommages");
        p.removeVie(getAgilite());
    }

    @Override
    public void specialAttack(Personnage p) {
        System.out.print("Joueur " + getPlayerNumber() + " utilise Concentration et ");
        addAgilité(getAgilite()/2);
        System.out.print("gagne " + getAgilite()/2 + " en Agilité\n");
    }

    // PROTECTED
    @Override
    protected String crie() {
        return "Voila!!";
    }
}
