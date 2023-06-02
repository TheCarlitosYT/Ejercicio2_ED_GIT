package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendentTest {

    @org.junit.jupiter.api.Test
    void suma() {
        SumaDescendent sc = new SumaDescendent(4578);
        assertEquals(5242, sc.suma());
    }

    @org.junit.jupiter.api.Test
    void suma2() {
        SumaDescendent sc = new SumaDescendent(1000);
        assertEquals(1000, sc.suma());
    }

    @org.junit.jupiter.api.Test
    void suma3() {
        SumaDescendent sc = new SumaDescendent(12345);
        assertEquals(15085, sc.suma());
    }

    @org.junit.jupiter.api.Test
    void suma4() {
        SumaDescendent sc = new SumaDescendent(32600);
        assertEquals(35800, sc.suma());
    }

    @org.junit.jupiter.api.Test
    void suma5() {
        SumaDescendent sc = new SumaDescendent(6534);
        assertEquals(7106, sc.suma());
    }
}