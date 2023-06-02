package es.iesmz.ed.algoritmes;


/**
 * @author Carlos Marin
 * @version 1.0
 * */
public class Polidivisible {
    private long numeropolidivisible;

    public Polidivisible(long numero) {
        this.numeropolidivisible = numero;
    }


/**
 *
 * @return true si es polidivisible, false si no
 * */
    public boolean esPolidivisible() {
        String numString = String.valueOf(numeropolidivisible);

        for (int i = 1; i <= numString.length(); i++) {
            long subNumero = Long.parseLong(numString.substring(0, i));
            if (subNumero % i != 0) {
                return false;
            }
        }

        return true;
    }
}
