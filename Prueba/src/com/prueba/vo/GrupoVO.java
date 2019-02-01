package com.prueba.vo;

public class GrupoVO {
    /**
     * Definicion de la clase GrupoVo
     * @author Jeronimo
     * @since 31/01/19
     * @version 1.0
     */
    static int id;
    static String nombre;
    static Double Sueldo;

    /**
     * Constructor de la clase
     */
    public GrupoVO() {
        super();
    }

    /**
     *Se asigna un valor a la propiedad id
     * @param id Tipo entero
     */
    public static void setId(int id) {
        GrupoVO.id = id;
    }

    /**
     * Obtenemos el id
     * @return id del Grupo
     */
    public static int getId() {
        return id;
    }

    /**
     * Se asigna un valor a la propiedad nombre
     * @param nombre Tipo cadena de caracteres
     */
    public static void setNombre(String nombre) {
        GrupoVO.nombre = nombre;
    }

    /**
     * Obtenemos el nombre
     * @return nombre del grupo
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     *Se asigna un valor a la propiedad sueldo
     * @param Sueldo Tipo Double 
     */
    public static void setSueldo(Double Sueldo) {
        GrupoVO.Sueldo = Sueldo;
    }

    /**
     *Obtenemos el sueldo del Grupo
     * @return sueldo del Grupo, con decimales
     */
    public static Double getSueldo() {
        return Sueldo;
    }

}
