package es.iesmz.ed.algoritmes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Carlos Marin
 * @version 1.0
 * */
class CablejatTest {

    /**
     * Traducido el enunciado, la parte final
     * */
    @org.junit.jupiter.api.Test
    void Conexion1() {
        Cablejat Cab = new Cablejat(new String[]{"FM"});
        assertTrue(Cab.esPotConnectar());
    }

    @org.junit.jupiter.api.Test
    void Conexion2() {
        Cablejat Cab = new Cablejat(new String[]{"MM"});
        assertFalse(Cab.esPotConnectar());
    }

    @org.junit.jupiter.api.Test
    void Conexion3() {
        Cablejat Cab = new Cablejat(new String[]{"FM" , "MF"});
        assertTrue(Cab.esPotConnectar());
    }

    @org.junit.jupiter.api.Test
    void Conexion4() {
        Cablejat Cab = new Cablejat(new String[]{"MF", "MM", "FF"});
        assertTrue(Cab.esPotConnectar());
    }
}