package com.edu.cesde;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carro mercedez = new Carro();
        mercedez.arrancar();
        System.out.println(mercedez.placa);
        mercedez.placa = "ABC123";
        System.out.println(mercedez.placa);
        Carro chevrolet = new Carro();
        chevrolet.color = "rojo";
        chevrolet.placa = "BCD123";
        mercedez.color = "verde";


    }
}
