package com.prueba.vo;

public class EquipoVO {
    private String nombre;
    private String edad;
    private String sexo;
    
    public EquipoVO() {
        super();
        nombre="";
        edad="";
        sexo="";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
    
    @Override
    public String toString(){
        return nombre+" tiene"+edad;
    }
}
