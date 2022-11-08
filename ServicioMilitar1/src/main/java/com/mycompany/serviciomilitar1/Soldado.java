/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciomilitar1;

/**
 *
 * @author Victor Alcivar
 */
public class Soldado {
    public String codigo;
    private String nombre;
    private String apellido;
    private String graduacion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(String graduacion) {
        this.graduacion = graduacion;
    }
    
    public String mostrarDatos(){
         return "codigo: "+codigo+"\nnombre: "+nombre+"\napellido: "+apellido+"\ngraduacion: "+graduacion;
    }
}
