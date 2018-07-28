package com.company.test;

import com.company.models.Rodeur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {

    @Test
    void BasiqueAttackDomRodeur_Are_Equals_To_RodeurAgility() {
        Rodeur attack = new Rodeur(4, 0, 4, 0, 1);
        Rodeur defense = new Rodeur(1, 0, 1, 0, 2);
        attack.basicAttack(defense);
        assertTrue(defense.getVie() == 1);
    }

    @Test
    public void SpecialAttack_Restore_TwoTimes_Is_Intelligence_HP() {
        Rodeur attack = new Rodeur(10, 0, 10, 0, 1);
        attack.specialAttack(attack);
        assertTrue(attack.getAgilite() == 15);
    }
}