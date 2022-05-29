
package paquete2;


public class Persona {
    
    private String name;
    private String surName;
    private String nickName;

    public Persona(String n, String sn, String nn){
        name = n;
        surName = sn;
        nickName = nn;
    }
    
    public void establecerName(String n) {
        name = n;
    }
    public void establecerSurName(String s) {
        surName = s;
    }
    public void establecerNickName(String nN) {
        nickName = nN;
    }

    public String obtenerName() {
        return name;
    }
    public String obtenerSurName() {
        return surName;
    }
    public String obtenerNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        String c = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "User name: %s\n"
                ,obtenerName()
                ,obtenerSurName()
                ,obtenerNickName()
        );
        return c;
    }
}
