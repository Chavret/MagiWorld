package com.company.test;

import com.company.Personnage;
import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    @Test
    public void Given_CaractereWithTooManyStats_Then_ThrowException() {
        assertThrows(SommeCaracteristiqueSuperieurAuNiveau.class, () -> new Personnage(2, 1, 1, 1));
    }
}