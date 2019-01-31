package com.prueba.vo;

public class ProyectoVO {
    private String nombre;
    private String actividades;
    private int integrantes;

    public ProyectoVO(String n, String a, int i) {
        super();
        this.nombre = n;
        this.actividades = a;
        this.integrantes = i;
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
