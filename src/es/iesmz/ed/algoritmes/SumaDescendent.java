package es.iesmz.ed.algoritmes;

/**
 * @author Carlos Marín
 * @version 1.0
 *
 * */
public class SumaDescendent {
    
    long numero;

    /**
     * @param numeropasado - especifica el numero pasado por el usuario para poder usarlo en varias funciones
     * */
    public SumaDescendent(long numeropasado) {
        this.numero = numeropasado;
    }


    /**
     * @return Long con el numero necesario
     * */

    public long suma(){
        String numlongitud = String.valueOf(this.numero);
        long numerocompleto = this.numero;
        long numerocomprimido;
        for (int i = 1; i < numlongitud.length(); i++) {
            numerocomprimido = Long.parseLong(numlongitud.substring(i));
        numerocompleto += numerocomprimido;
        }

        return numerocompleto;
    }

}
