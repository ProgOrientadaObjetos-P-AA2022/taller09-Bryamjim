
package paquete3;

import paquete2.Persona;


public class Prestamo{
    
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;
    
    public Prestamo(Persona b, int t, String c){
        beneficiario = b;
        tiempoPrestamo = t;
        ciudadPrestamo = c;
    }
    
    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }
    public void establecerTiempoPrestamo(int tP) {
        tiempoPrestamo = tP;
    }
    public void establecerCiudadPrestamo(String c) {
        ciudadPrestamo = c;
    }
    
    public Persona obtenerBeneficiario() {
        return beneficiario;
    }
    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }
    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        String c = String.format("Beneficiario %s\n"
                + "Tiempo del prestamo en meses: %d\n"
                + "Ciudad: %s\n"
                ,obtenerBeneficiario()
                ,obtenerTiempoPrestamo()
                ,obtenerCiudadPrestamo()
        );
        return c;
    }
}
