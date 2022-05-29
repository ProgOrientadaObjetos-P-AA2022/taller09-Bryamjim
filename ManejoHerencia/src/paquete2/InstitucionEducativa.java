
package paquete2;


public class InstitucionEducativa {

    private String name;
    private String siglas;

    public InstitucionEducativa(String n, String s) {
        name = n;
        siglas = s;
    }

    public void establecerName(String n) {
        name = n;
    }
    public void establecerSiglas(String s) {
        siglas = s;
    }
    public String obtenerName() {
        return name;
    }
    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Siglas: %s\n",
                 obtenerName(),
                 obtenerSiglas()
        );
        return cadena;
    }
}
