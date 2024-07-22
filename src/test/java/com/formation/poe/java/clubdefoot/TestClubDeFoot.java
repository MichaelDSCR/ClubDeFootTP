package com.formation.poe.java.clubdefoot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClubDeFootTest {

    private ClubDeFoot club;

    @BeforeEach
    void setUp() {
        club = new ClubDeFoot("Test Club");
    }

    @Test
    void testSetMatchsRemportes() {
        assertDoesNotThrow(() -> club.setMatchsRemportes(5));
        assertEquals(5, club.getMatchsRemportes());

        assertThrows(IllegalArgumentException.class, () -> club.setMatchsRemportes(-1));
    }

    @Test
    void testSetMatchsNuls() {
        assertDoesNotThrow(() -> club.setMatchsNuls(3));
        assertEquals(3, club.getMatchsNuls());

        assertThrows(IllegalArgumentException.class, () -> club.setMatchsNuls(-1));
    }

    @Test
    void testSetMatchsPerdus() {
        assertDoesNotThrow(() -> club.setMatchsPerdus(2));
        assertEquals(2, club.getMatchsPerdus());

        assertThrows(IllegalArgumentException.class, () -> club.setMatchsPerdus(-1));
    }

    @Test
    void testSetButsMarques() {
        assertDoesNotThrow(() -> club.setButsMarques(10));
        assertEquals(10, club.getButsMarques());

        assertThrows(IllegalArgumentException.class, () -> club.setButsMarques(-1));
    }

    @Test
    void testGetScore() {
        club.setMatchsRemportes(4);
        club.setMatchsNuls(2);
        assertEquals(14, club.getScore());
    }
}
