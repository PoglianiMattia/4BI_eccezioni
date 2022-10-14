package main;

import java.util.IllegalFormatFlagsException;

public class Scarpa {
    private int numero;

    public int getNumero() throws InterruptedException{
        Thread.sleep(2000);
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Scarpa(int numero) {
        this.numero = numero;
    }
}
