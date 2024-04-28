package com.mycompany.libropoo;
import java.util.Scanner;

public class Principal {

    //O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buen dia.");
        System.out.println("Por favor ingrese el titulo del libro:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();
        System.out.println("Ingrese el género literario del libro:");
        String genero = sc.nextLine();
        System.out.println("Ingrese el año de publicación del libro");
        int anoPublicacion = sc.nextInt();

        boolean leido = false;
        //O(1)
        libroUsuario.marcarLeido();
        System.out.println(libroUsuario.mostrarInformacion());
        libroUsuario.isLeido();
        if (libroUsuario.isLeido() == true) {
            System.out.println("El libro " + titulo + " ya fue leído.");
        } else {
            System.out.println("No has leido " + titulo);
        }
        if (libroUsuario.esAntiguo() == true) {
            System.out.println("El libro es antiguo.");
        }
    }
}