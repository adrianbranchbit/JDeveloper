package com.prueba.vo;

public class EquipoVO {
    /** <h1>Esta clase define objetos que contienen atributos especificos de un Equipo</h1>
     * @author Branchbit
     * @since 29/01/19
     * @version 1.0
     */
    private String nombre;
    private String edad;
    private String sexo;
    private String base64;
    private String nombreArchivo;


    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getBase64() {
        return base64;
    }
 


    /** <p style="color:#FF0000";>Inicializamos las variables en el construtor</p>
     */
    public EquipoVO() {
        super();
        nombre="";
        edad="";
        sexo="";
        base64="";
    }
    
    /** <p alig="left">Asignamos un valor a la
     * propiedad Nombre</p>
     * @param nombre nuevo valor para asignar a nombre
     * */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


     /** Obtenemos la propiedad Nombre
      * @return Devuelve el nombre del Equipo
      */
    public String getNombre() {
        return nombre;
    }

    /** Asignamos un valor a la propiedad Edad
     * @param edad nuevo valor para asignar a edad
     * */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    /** Obtenemos la propiedad Edad
     * @return Devuelve la edad del Equipo
     */
    public String getEdad() {
        return edad;
    }
    
    /** Asignamos un valor a la propiedad Sexo
     * @param sexo nuevo valor para asignar a sexo
     * */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /** Obtenemos la propiedad Sexo
     * @return Devuelve el sexo del Equipo
     */
    public String getSexo() {
        return sexo;
    }
    
    /** Sobreescribimos el metodo toString para tener un resultado mas especifico y rapido del 
     * objeto EquipoVO
     * @return Devuelve nombre y la edad del Equipo
     */
    @Override
    public String toString(){
        return nombre+" tiene "+edad;
    }
}
