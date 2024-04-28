package com.mycompany.libropoo;

public class Libro { 
    //O(1)
    private String titulo; 
    private String autor; 
    private int anoPublicacion; 
    private String genero;
    private boolean leido; 
    //O(1)
    public Libro(String titulo, String autor, int anoPublicacion, boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion; 
        this.genero = genero;
        this.leido = false;
    }

    Libro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //O(1)
    public String mostrarInformacion (){ 
        return "Título: " + titulo + "Autor: " + autor + "Año de publicación: " + anoPublicacion + "Género: " + genero;
    } 
    //O(1)
    public void marcarLeido() { 
        leido = true; 
    } 
    //O(1) 
    public boolean isLeido() { 
        return leido;
    }
    //O(1)
    public boolean esAntiguo() { 
        if (anoPublicacion < 1974) 
                return true;  
        else  
                return false;
    }
    
}
