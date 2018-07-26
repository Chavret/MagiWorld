package com.company.models;

import com.company.Personnage;

public class Rodeur extends Personnage {
    public Rodeur(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }

    @Override
    public void basicAttack(Personnage p) {
        super.basicAttack(p);
    }

    @Override
    public void specialAttack(Personnage p) {
        super.specialAttack(p);
    }

    @Override
    protected String crie() {
        return "Voila!!";
    }
}
