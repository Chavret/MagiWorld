package com.company.models;

import com.company.Personnage;

public class Rodeur extends Personnage {
    public Rodeur(int niveau, int force, int agilite, int intelligence, int playerNumber) {
        super(niveau, force, agilite, intelligence, playerNumber);
    }

    @Override
    public void basicAttack(Personnage p) {

    }

    @Override
    public void specialAttack(Personnage p) {

    }

    @Override
    protected String crie() {
        return "Voila!!";
    }
}
