package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    
    long numero;
    public SumaDescendent(long numeropasado) {
        this.numero = numeropasado;
    }
    
    
    public void suma(){
        String numlongitud = String.valueOf(this.numero);
        long numeros = this.numero;
        for (int i = 0; i < numlongitud.length(); i++) {
        numeros = numlongitud.charAt(i);
            System.out.println(numeros);
        }
    }
}
