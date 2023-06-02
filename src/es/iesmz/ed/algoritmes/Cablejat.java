package es.iesmz.ed.algoritmes;

import java.lang.reflect.Array;
import java.util.*;
/**
 * @author Carlos Marin
 * @version 1.0
 * */
public class Cablejat {

    private String[] conectores;

    public Cablejat(String[] StrConec) {
        this.conectores = StrConec;
    }

    public boolean esPotConnectar() {
        int ConecMasculino = 0;
        int ConecFemenino = 0;

        for (String tipoConnector : conectores) {
            switch (tipoConnector) {
                case "MM" -> ConecMasculino += 2;
                case "MF", "FM" -> {
                    ConecMasculino++;
                    ConecFemenino++;
                }
                case "FF" -> ConecFemenino += 2;
            }
        }
        /*System.out.println( "Conectores masculinos " + ConecMasculino);
        System.out.println( "Conectores Femeninos " + ConecFemenino);*/

        return ConecMasculino == ConecFemenino;
    }

}
