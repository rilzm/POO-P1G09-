/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciomilitar1;

/**
 *
 * @author Victor Alcivar
 */
public class Compania extends Soldado{
    private String numcompania;
    private String actividad;

    public String getNumcompania() {
        return numcompania;
    }

    public void setNumcompania(String numcompania) {
        this.numcompania = numcompania;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    @Override
    public String mostrarDatos(){
        return "numcompania: "+numcompania+"\nactividad: "+actividad;
    }

}