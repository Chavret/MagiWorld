package com.company.test;

import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;
import com.company.models.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    @Test
    public void Given_CaractereWithTooManyStats_Then_ThrowException() {
        assertThrows(SommeCaracteristiqueSuperieurAuNiveau.class, () -> new Guerrier(2, 1, 1, 1, 1));
    }

    @Test
    public void Remove_More_Life_Than_Caractere_Has_Set_Life_To_Zero() {
        Personnage guerrier = new Guerrier(10, 10, 0, 0, 1);
        guerrier.removeVie(60);
        assertTrue(guerrier.getVie() == 0);
    }
}