package es.iesmz.ed.algoritmes;

import java.lang.reflect.Array;
import java.util.*;

public class Cablejat {
    private ArrayList<String> connectors;

    public Cablejat(String[] connectors) {
        this.connectors = new ArrayList<>();
        this.connectors.addAll(Arrays.asList(connectors));
    }

    public boolean esPotConnectar() {
        int maleCount = 0;
        int femaleCount = 0;

        for (String connector : connectors) {
            if (connector.equals("MM") || connector.equals("MF")) {
                maleCount++;
            } else if (connector.equals("FF") || connector.equals("FM")) {
                femaleCount++;
            }
        }

        return maleCount == femaleCount;
    }

}
