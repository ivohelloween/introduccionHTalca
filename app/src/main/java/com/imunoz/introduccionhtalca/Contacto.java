package com.imunoz.introduccionhtalca;

import java.io.Serializable;

public class Contacto  implements Serializable {
    private String nombre;
    private String apeellido;

    public Contacto(String nombre, String apellido) {
        this.nombre=nombre;
        this.apeellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeellido() {
        return apeellido;
    }

    public void setApeellido(String apeellido) {
        this.apeellido = apeellido;
    }
}
