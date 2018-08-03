package com.company.test;

import com.company.models.*;
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
        Mage mage = new Mage(7, 0, 0, 7, 1);
        mage.removeVie(15);
        mage.specialAttack(mage);
        assertTrue(mage.getVie() == 34);
    }

    @Test
    public void Add_More_Life_Than_Caractere_Has_Initialy_Dont_Set_More_Than_Initial_Life() {
        Personnage mage = new Mage(10, 0, 0, 10, 1);
        mage.removeVie(10);
        mage.specialAttack(mage);
        assertTrue(mage.getVie() == 50);
    }
}