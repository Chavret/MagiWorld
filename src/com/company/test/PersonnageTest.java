package com.company.test;

import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;
import com.company.models.Guerrier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    @Test
    public void Given_CaractereWithTooManyStats_Then_ThrowException() {
        assertThrows(SommeCaracteristiqueSuperieurAuNiveau.class, () -> new Guerrier(2, 1, 1, 1, 1));
    }
}