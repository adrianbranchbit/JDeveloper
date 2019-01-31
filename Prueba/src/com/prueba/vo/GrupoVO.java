package com.prueba.vo;

public class GrupoVO {
    static int id;
    static String nombre;
    static Double Sueldo;
    
    public GrupoVO() {
        super();
    }
    public static void setId(int id) {
        GrupoVO.id = id;
    }

    public static int getId() {
        return id;
    }

    public static void setNombre(String nombre) {
        GrupoVO.nombre = nombre;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setSueldo(Double Sueldo) {
        GrupoVO.Sueldo = Sueldo;
    }

    public static Double getSueldo() {
        return Sueldo;
    }

}
