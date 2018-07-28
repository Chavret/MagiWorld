package com.company.models;

import com.company.Personnage;

public class Rodeur extends Personnage {
    public Rodeur(int niveau, int force, int agilite, int intelligence, int playerNumber) {
        super(niveau, force, agilite, intelligence, playerNumber);
    }

    @Override
    public void basicAttack(Personnage p) {
        System.out.println("Joueur " + getPlayerNumber() + " utilise Tir à l'Arc et inflige " + getAgilite() + " dommages");
        p.removeVie(getAgilite());
    }

    @Override
    public void specialAttack(Personnage p) {
        System.out.println("Joueur " + getPlayerNumber() + " utilise Coup de Rage et inflige " + getForce()*2 + " dommages");
        p.removeVie(getForce()*2);
        removeVie(getForce()/2);
    }

    @Override
    protected String crie() {
        return "Voila!!";
    }
}
