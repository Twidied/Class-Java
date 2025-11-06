package com.diego;

public class Main {
    public static void main(String[] args) {
        int numero = 100;
        long otroNumero = 10L;
        boolean bandera = true;
        float decimal = 0.5f;
        double decimalpro = 0.5;
        char caracter = 'A';
        String saludo = "Hello world!";

        System.out.println("Tipos primitivos");
        System.out.println(numero);
        System.out.println(otroNumero);
        System.out.println(bandera);
        System.out.println(decimal);
        System.out.println(decimalpro);
        System.out.println(caracter);
        
        System.out.println("Tipos referencias");
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(saludo); 
        
        //No es primitivo es de referencia

        /int dia = 4;
        actividades(dia);
        actividades(++dia);
        actividades(dia++);
        actividades(dia);/

        System.out.println(1+2);
        System.out.println(1-2);
        System.out.println(1*2);
        System.out.println(1/2);
        System.out.println(10%2);
        actividades(2);

        System.out.println(Math.pow(2, 5));

        var resultado = circunferencia(30);
        System.out.println(resultado);
    }
    public static double circunferencia(int diametro){
        System.out.println("Circunferencia:");
        return 2 * Math.PI * diametro;
    }

    public static void actividades(int dia){
        String[] cosasPorhacer = {"Ir a la iglesia", "Venir a campus", "venira acampus",
            "venir a campus", "no venir a campus", "Ser feliz" };
        System.out.println("Que nos toca hacer HOY!");
        if (dia >= DIAS_DE_LA_SEMANA) {
            System.out.println("bye");
        } else {
            System.out.println(cosasPorhacer[dia]);
            System.out.println(dia);
        }
    }
}