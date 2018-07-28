package com.company.test;

import com.company.models.Mage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void BasiqueAttackDommage_Are_Equals_To_MageIntelligence() {
        Mage attack = new Mage(6, 0, 0, 6, 1);
        Mage defense = new Mage(3, 1, 1, 1, 2);
        attack.basicAttack(defense);
        assertTrue(defense.getVie() == 9);
    }

    @Test
    public void SpecialAttack_Restore_TwoTimes_Is_Intelligence_HP() {
        Mage attack = new Mage(7, 0, 0, 7, 1);
        attack.removeVie(15);
        attack.specialAttack(attack);
        assertTrue(attack.getVie() == 34);
    }
}