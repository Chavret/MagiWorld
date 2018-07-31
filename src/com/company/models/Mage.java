package com.company.models;

public class Mage extends Personnage {

    private static int vie_initiale;

    public Mage(int niveau, int force, int agilite, int intelligence, int playerNumber) {
        super(niveau, force, agilite, intelligence, playerNumber);
        vie_initiale = niveau * 5;
    }

    // PUBLIC
    @Override
    public void basicAttack(Personnage p) {
        System.out.println("Joueur " + getPlayerNumber() + " utilise Boule de Feu et inflige " + getIntelligence() + " dommages");
        p.removeVie(getIntelligence());
    }

    @Override
    public void specialAttack(Personnage p) {
        // System.out.print("Joueur " + getPlayerNumber() + " utilise Soin et ");
        int currentVie = getVie();
        addVie(((currentVie + getIntelligence()*2) > vie_initiale) ? vie_initiale - getVie() : getIntelligence()*2);
        // System.out.print("gagne " + (getVie() - currentVie) + " en Vitalité\n");
    }

    // PROTECTED
    @Override
    protected String crie() { return "Abracadabra"; }
}
