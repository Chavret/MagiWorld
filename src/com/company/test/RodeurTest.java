package com.company.test;

import com.company.models.Rodeur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {

    @Test
    void BasiqueAttackDommage_Are_Equals_To_RodeurAgility() {
        Rodeur attack = new Rodeur(4, 0, 4, 0, 1);
        Rodeur defense = new Rodeur(1, 0, 1, 0, 2);
        attack.basicAttack(defense);
        assertTrue(defense.getVie() == 1);
    }

    @Test
    void specialAttack() {
    }
}