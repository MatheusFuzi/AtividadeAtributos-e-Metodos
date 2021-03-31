package br.com.mycompany.poo;

import java.util.Scanner;

public class Concretemixer {

    String brand;
    String voltz;
    String power;
    String capacity;
    Double price;
    Integer mix;
    Integer ciment, change = 0, option = 1, on = 0, j;

    void ler() {

        System.out.println("Voce deseja ligar a Betoneira? \n 1 - Sim 2 - Nao");
        Scanner ler = new Scanner(System.in);
        change = ler.nextInt();

        if (change == 1) {
            on = 1;
            mixer();

        } else {

            System.out.println("A Betoneira nao foi ligada\n");
        }
    }

    void turnoff() {
        System.out.println("Deseja Desligar a Betoneira\n 1- Sim 2- nao");
        Scanner ler = new Scanner(System.in);
        option = ler.nextInt();
        if (option == 1){
            System.out.println("O Cimento esta misturado! \n");
            System.exit(0);
        } else{
            mixer();
        }
    }

    void mixer() {
        if (on == 1) {
            for (Integer i = 0; i <= 10; i++) {
                System.out.println("A betoneira esta misturando.\n");
                if (i == 10) {
                    turnoff();
                }
            }
        } 

    }

    public static void main(String[] args) {

        Concretemixer Concretemixer1 = new Concretemixer();
        Concretemixer1.brand = "Menegotti";
        Concretemixer1.voltz = "220V";
        Concretemixer1.power = "3cv";
        Concretemixer1.capacity = "500 Litros";
        Concretemixer1.price = 6499.00;

        Concretemixer Concretemixer2 = new Concretemixer();
        Concretemixer2.brand = "FortG";
        Concretemixer2.voltz = "220v";
        Concretemixer2.power = "2CV";
        Concretemixer2.capacity = "400 Litros";
        Concretemixer2.price = 3199.90;

        Concretemixer Concretemixer3 = new Concretemixer();
        Concretemixer3.brand = "Menegotti";
        Concretemixer3.voltz = "110v";
        Concretemixer3.power = "1/2CV";
        Concretemixer3.capacity = "150 Litros";
        Concretemixer3.price = 1699.90;

        Concretemixer1.ler();
    }

}
