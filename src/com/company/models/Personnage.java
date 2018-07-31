package com.company.models;

import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;

public abstract class Personnage {

    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;
    private int playerNumber;

    public Personnage(int niveau, int force, int agilite, int intelligence, int playerNumber) {
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        if ((force + agilite + intelligence) > niveau) throw new SommeCaracteristiqueSuperieurAuNiveau();
        this.niveau = niveau;
        this.vie = niveau * 5;
        this.playerNumber = playerNumber;
    }

    // PUBLIC
    public void removeVie(int dommages) {
        int oldVie = this.vie;

        if (dommages > 0) {
            this.vie = (this.vie - dommages >= 0) ? this.vie - dommages : 0;
            System.out.println("Joueur " + getPlayerNumber() + " perd " + (oldVie - this.vie) + " points de vie");
        }
    }

    public void addVie(int vie) {
        int currentVie = getVie();
        this.vie = this.vie + vie;
        System.out.print("Joueur " + getPlayerNumber() + " utilise Soin et ");
        System.out.print("gagne " + (getVie() - currentVie) + " en Vitalité\n");
    }

    public void addAgilité(int agi) {
        this.agilite = this.agilite + agi;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPlayerNumber() { return playerNumber; }

    public String introduce() {
        return (crie() +  " je suis le " + getClass().getSimpleName() +
            " joueur " + getPlayerNumber() + " niveau " + getNiveau() + " je possède " +
            getVie() + " de vitalité, " + getForce() + " de force, " +
            getAgilite() + " d'agilite et " + getIntelligence() + " d'intelligence");
    }

    public String askPlayerAction() {
        return ("Joueur " + getPlayerNumber() + "(" + getVie() + ") veuillez choisir votre action " +
                "(1 : Attaque Basique, 2 : Attaque Spécial)");
    }

    // PUBLIC ABSTRACT
    public abstract void basicAttack(Personnage p);

    public abstract void specialAttack(Personnage p);

    // PROTECTED ABSTRACT
    protected abstract String crie();
}
