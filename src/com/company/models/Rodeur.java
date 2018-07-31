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

    /**
     * augmente l'agilite du rodeur
     * @param p
     *              paametre obsolete ici
     */
    @Override
    public void specialAttack(Personnage p) {
        addAgilité(getAgilite()/2);
    }

    // PROTECTED
    @Override
    protected String crie() {
        return "Voila!!";
    }

    // PRIVATE
    private void addAgilité(int agi) {
        setAgilite(getAgilite() + agi);
        System.out.print("Joueur " + getPlayerNumber() + " utilise Concentration et ");
        System.out.print("gagne " + agi + " en Agilité\n");
    }
}
