package com.tsp.gespro.hibernate.pojo;
// Generated 14/08/2016 01:56:19 PM by Hibernate Tools 3.6.0



/**
 * Cobertura generated by hbm2java
 */
public class Cobertura  implements java.io.Serializable {


     private Integer idCobertura;
     private int idProyecto;
     private String nombre;

    public Cobertura() {
    }

	
    public Cobertura(int idProyecto) {
        this.idProyecto = idProyecto;
    }
    public Cobertura(int idProyecto, String nombre) {
       this.idProyecto = idProyecto;
       this.nombre = nombre;
    }
   
    public Integer getIdCobertura() {
        return this.idCobertura;
    }
    
    public void setIdCobertura(Integer idCobertura) {
        this.idCobertura = idCobertura;
    }
    public int getIdProyecto() {
        return this.idProyecto;
    }
    
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


