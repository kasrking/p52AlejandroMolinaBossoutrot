/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ejemploweb;

/**
 *
 * @author kasrking
 */
public class Cliente {
    
    private String nombre;
    private int edad;
    private String mail;  

    // CONSTRUCTOR
    public Cliente(String nombre, int edad, String mail) {
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
    }

    // GETTERS    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMail() {
        return mail;
    }

    // SETTERS    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    // toString

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", mail=" + mail + '}';
    }
    
    
    
    
    
    
    
}
