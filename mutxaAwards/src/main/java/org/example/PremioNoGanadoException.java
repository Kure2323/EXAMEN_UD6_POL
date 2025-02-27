package org.example;

public class PremioNoGanadoException extends RuntimeException {
    public PremioNoGanadoException() {
        super("No puede recoger un premio que no ha ganado");
    }
}
