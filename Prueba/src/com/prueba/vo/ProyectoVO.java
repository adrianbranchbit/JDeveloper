package com.prueba.vo;

public class ProyectoVO {
    /**
     * Definicion de la clase ProyectoVO
     * @author Jeronimo
     * @since 31/01/19
     * @version 1.0
     */
    private String nombre;
    private String actividades;
    private int integrantes;
    
    private String variable;

    /**
     * Constructor de la clase
     * @param nom Tipo String
     * @param act Tipo String
     * @param inte Tipo int
     */
    public ProyectoVO(String nom, String act, int inte) {
        super();
        this.nombre = nom;
        this.actividades = act;
        this.integrantes = inte;
    }
    /**
     *Asignamos un valor a la propiedad nombre
     * @param nombre Tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Se obtiene el valor de la propiedad nombre
     * @return nombre del Proyecto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Se asigna un valor a la propiedad actividades
     * @param actividades Tipo String
     */
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    
    /**
     * Se obtiene el valor de la propiedad actividades
     * @return actividades del proyecto
     */
    public String getActividades() {
        return actividades;
    }
    
    /**
     * Se asigna un valor a la propiedad integrantes
     * @param integrantes Tipo int
     */
    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }
    
    /**
     * Se obtiene el valor de la propiedad integrantes
     * @return integrantes del proyecto
     */
    public int getIntegrantes() {
        return integrantes;
    }

    /**
     * Se asigna un valor a la propiedad variable
     * @param variable Tipo String
     */
    public void setVariable(String variable) {
        this.variable = variable;
    }
    
    /**
     * Se obtiene el valor de la propiedad variable
     * @return variable del Equipo
     */
    public String getVariable() {
        return variable;
    }
}
