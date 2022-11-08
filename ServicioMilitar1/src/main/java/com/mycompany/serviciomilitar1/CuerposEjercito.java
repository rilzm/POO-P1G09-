/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciomilitar1;

/**
 *
 * @author Victor Alcivar
 */
public class CuerposEjercito extends Soldado{
    public String codigocuerpo;
    private String denominacion;

    public String getCodigoCuerpo() {
        return codigo;
    }

    public void setCodigoCuerpo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    @Override
    public String mostrarDatos(){
        return "\ncodigocuerpo: "+codigocuerpo+"\ndenominacion: "+denominacion;
    }

}
