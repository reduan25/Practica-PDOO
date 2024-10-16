/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbuy;

/**
 *
 * @author Usuario
 */
public class Coche {
    private String marca;
    private String modelo;
    private int year;
    private double precio;
    
    public Coche(String dato_marca, String dato_modelo, int dato_year, double dato_precio){
    this.marca = dato_marca;
    this.modelo = dato_modelo;
    this.year = dato_year;
    this.precio = dato_precio;
    }

    public Coche(){
        this("Default", "Default", 2013, 16340.0);
    }

    public Coche(Coche otro){
        this(otro.marca, otro.modelo, otro.year, otro.precio);
    }
}

