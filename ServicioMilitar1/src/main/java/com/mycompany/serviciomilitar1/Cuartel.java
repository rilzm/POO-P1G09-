/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciomilitar1;

/**
 *
 * @author Victor Alcivar
 */
public class Cuartel extends CuerposEjercito {
    private String nombre;
    private String ubicacion;
    private String codigo;

    /**
     *
     * @return
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public String mostrarDatos(){
        return "nombre: "+nombre+"\nubicacion: "+ubicacion+"\ncodigo"+codigo;
    }

}