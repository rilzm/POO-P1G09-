/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.serviciomilitar1;

/**
 *
 * @author Victor Alcivar
 */
public class ServicioMilitar1 {

    public static void main(String[] args) {
       Soldado soldado1 = new Soldado();
       soldado1.setCodigo("12");
       soldado1.setNombre("Ricardo ");
       soldado1.setApellido("lopez");
       Soldado soldado2 = new Soldado();
       soldado2.setCodigo("13");
       soldado2.setNombre("Victor ");
       soldado2.setApellido("Alcivar");
       
       Cuartel cuartel1 = new Cuartel();
       cuartel1.setCodigo("23");
       cuartel1.setNombre("Dashee Park");
       cuartel1.setUbicacion("");
       
       CuerposEjercito cuerpos_ejercito1 = new CuerposEjercito();
       cuerpos_ejercito1.setCodigoCuerpo("Lissenia 001");
       cuerpos_ejercito1.setDenominacion("POO");
       
       Compania companias1 = new Compania();
       companias1.setNumcompania("01");
       companias1.setActividad("infanteria");
       
       Servicios servicios1= new Servicios();
       servicios1.setCodigo("001");
       servicios1.setDescripcion("guardias");
       
        System.out.println("Presenta los nombres todos los nombres de todos los objetos instanciados...");
        System.out.println("soldado1.getNombre() = "+soldado1.getNombre());
        System.out.println("cuartel1.getNombre() = "+cuartel1.getNombre());
        System.out.println("compaÃ±ias1.getnombre() = "+companias1.getNumcompania());
        System.out.println("cuerpos_ejercito1.getcodigocuerpo() = "+cuerpos_ejercito1.getCodigoCuerpo());
        System.out.println("servicios1.getcodigo) = "+cuartel1.getCodigo());
        
    }
}
