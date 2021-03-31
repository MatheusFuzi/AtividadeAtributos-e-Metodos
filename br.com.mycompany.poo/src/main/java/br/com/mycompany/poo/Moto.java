
package br.com.mycompany.poo;

public class Moto {

    String model;
    String brand;
    String fuel;
    Double price;
    Integer year;
    String color;

    public static void main(String[] args) {

        Moto moto1 = new Moto();
        moto1.model = "MT-03";
        moto1.brand = "Yamaha";
        moto1.fuel = "Flex";
        moto1.price = 350000.00;
        moto1.year = 2020;
        moto1.color = "Camuflada";

        Moto Moto2 = new Moto();
        Moto2.model = "DT180";
        Moto2.brand = "Yamaha";
        Moto2.fuel = "Gasolina";
        Moto2.price = 10000.00;
        Moto2.year = 1986;
        Moto2.color = "Preta";

        Moto Moto3 = new Moto();
        Moto3.model = "RD350";
        Moto3.brand = "Yamaha";
        Moto3.fuel = "Gasolina";
        Moto3.price = 15000.00;
        Moto3.year = 1998;
        Moto3.color = "Azul";

    }
}
