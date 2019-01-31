package com.prueba.vo;

public class ProyectoVO {
    private String nombre;
    private String actividades;
    private int integrantes;
    
    private String variable;


    public ProyectoVO(String nom, String act, int inte) {
        super();
        this.nombre = nom;
        this.actividades = act;
        this.integrantes = inte;
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


    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

}
