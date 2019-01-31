package com.prueba.vo;

public class ProyectoVO {
    private String nombre;
    private String actividades;
    private int integrantes;

<<<<<<< HEAD
    public ProyectoVO(String nom, String act, int inte) {
        super();
        this.nombre = nom;
        this.actividades = act;
        this.integrantes = inte;
=======
    public ProyectoVO(String nombre, String actividades, int integrantes) {
        super();
        this.nombre = nombre;
        this.actividades = actividades;
        this.integrantes = integrantes;
>>>>>>> add66c3f9c18364a0f3e401688bc3fb5b525b78c
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getActividades() {
        return actividades;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

}
