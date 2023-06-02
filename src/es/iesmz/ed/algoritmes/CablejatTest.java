package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CablejatTest {

    @Test
    void esPotConnectar() {
        Cablejat Cab = new Cablejat(new String[]{"HM"});
        assertTrue(Cab.esPotConnectar());
    }
}