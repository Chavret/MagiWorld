package com.company;

import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;

public class Personnage {

    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;

    public Personnage(int niveau, int force, int agilite, int intelligence) {
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        if ((force + agilite + intelligence) > niveau) throw new SommeCaracteristiqueSuperieurAuNiveau();
        this.niveau = niveau;
        this.vie = niveau * 5;
    }

    public void basicAttack(Personnage p) {}

    public void specialAttack(Personnage p) {}

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
}
