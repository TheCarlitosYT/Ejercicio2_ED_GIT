package es.iesmz.ed.algoritmes;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Carlos Marin
 * @version 1.0
 * */

class PolidivisibleTest {

    /**
     * Tests:
     * */
    @Test
    void esPolidivisible1() {
        Polidivisible PL = new Polidivisible( 9876);
        assertTrue(PL.esPolidivisible());
    }

    @Test
    void esPolidivisible2() {
        Polidivisible PL = new Polidivisible( 102);
        assertTrue(PL.esPolidivisible());
    }

    @Test
    void esPolidivisible3() {
        Polidivisible PL = new Polidivisible( 1234);
        assertFalse(PL.esPolidivisible());
    }

    @Test
    void esPolidivisible4() {
        Polidivisible PL = new Polidivisible( 8375);
        assertFalse(PL.esPolidivisible());
    }
}