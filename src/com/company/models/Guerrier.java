package com.company.models;

import com.company.Personnage;

public class Guerrier extends Personnage {
    public Guerrier(int niveau, int force, int agilite, int intelligence, int playerNumber) {
        super(niveau, force, agilite, intelligence, playerNumber);
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
    protected String crie() { return "Woarg"; }
}
