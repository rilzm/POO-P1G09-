/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.serviciomilitar;

/**
 *
 * @author rlope
 */
public class ServicioMilitar {

    public static void main(String[] args) {
       Soldado soldado1 = new Soldado();
       soldado1.setCodigo("12");
       soldado1.setNombre("Pedro Martinez");
       soldado1.setApellido("thomas more");
       
       Cuartel cuartel1 = new Cuartel();
       cuartel1.setCodigo("23");
       cuartel1.setNombre("Dashee Park");
       cuartel1.setUbicacion("");
       
       CuerposEjercito cuerpos_ejercito1 = new CuerposEjercito();
       cuerpos_ejercito1.setCodigoCuerpo("Lissenia Sornoza");
       cuerpos_ejercito1.setDenominacion("POO");
       
       Compañias compañias1= new Compañias();
       compañias1.setNumcompañia("");
       compañias1.setActividad("");
       
       Servicios servicios1= new Servicios();
       servicios1.setCodigo("");
       servicios1.setDescripcion("");
       
        System.out.println("Presenta los nombres todos los nombres de todos los objetos instanciados...");
        System.out.println("soldado1.getNombre() = "+soldado1.getNombre());
        System.out.println("cuartel1.getNombre() = "+cuartel1.getNombre());
        System.out.println("compañias1.getnombre() = "+compañias1.getNumcompañia());
        System.out.println("cuerpos_ejercito1.getcodigocuerpo() = "+cuerpos_ejercito1.getCodigoCuerpo());
        System.out.println("servicios1.getcodigo) = "+cuartel1.getCodigo());
        
    }
}
