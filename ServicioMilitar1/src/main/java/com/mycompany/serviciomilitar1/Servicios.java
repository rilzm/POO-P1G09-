/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciomilitar1;

/**
 *
 * @author Victor Alcivar
 */

public class Servicios extends Soldado {
    private String codigo1;
    private String descripcion;

    @Override
    public String getCodigo() {
        return codigo1;
    }
    
    @Override
    public void setCodigo(String codigo) {
        this.codigo1 = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String mostrarDatos(){
        return "codigo: "+codigo+"\ndescripcion: "+descripcion;
    
}
}