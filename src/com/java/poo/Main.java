package com.java.poo;

public class Main {
    public static void main(String[] args) {

        Carro meucCarro = new Carro("Civic");
        meucCarro.acelerar();
    }
}

class Carro{
        String modelo;

     public Carro( String modelo ){
         this.modelo = modelo;

     }
     public void  acelerar(){
         System.out.println("Acelerando Vruum");
     }
}