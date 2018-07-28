package com.company.test;

import com.company.models.Guerrier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {

    @Test
    public void BasiqueAttackDommage_Are_Equals_To_WarriorLevel() {
        Guerrier attack = new Guerrier(2, 2, 0, 0, 1);
        Guerrier defense = new Guerrier(1, 1, 0, 0, 2);
        attack.basicAttack(defense);
        assertTrue(defense.getVie() == 3);
    }

    @Test
    void specialAttack() {
    }
}