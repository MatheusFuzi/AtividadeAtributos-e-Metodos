package br.com.mycompany.poo;

import java.util.Scanner;

public class Cell {

    String model;
    String brand;
    Integer memory;
    String color;
    Integer baterry = 100;
    Integer energy = 100;
    Integer recarga = 0;
    Integer ready = 0;

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cell{" + "model= " + model + ", brand= " + brand + ", memory= " + memory + "GB , color= " + color;
    }

    void lowbaterry() {
        dischargin(baterry);
        baterry = baterry - 5;
    }

    void dischargin(Integer chargin) {

        if (energy > 15) {
            energy = energy - 5;
            baterry = baterry - 5;
            System.out.println("Menos 5% \n");
            System.out.println("Carga: " + baterry);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println();
            }
            lowbaterry();
        } else {
            System.out.println("Bateria fraca carregue imediateamente!");
        }
        if (baterry == 15){
        System.out.println("Deseja colocar na tomada? 1 - sim 2 - não");
        Scanner ler = new Scanner(System.in);
        recarga = ler.nextInt();
        } else{
            System.out.println("Bateria totalmente carregada \n");
            System.out.println("Seu Celular esta pronto para uso \n");
            System.exit(0);
        }

        if (recarga == 1) {

            for (int x = 0; baterry < 100; x++) {
                
                energy = energy + 5;
                baterry = baterry + 5;
                System.out.println("Mais 5% \n");
                System.out.println("Carga: " + baterry);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println();
                }
                if (baterry == 100) {                                                                    
                    
                }
            }

        } else if (recarga == 2 ) {
            System.out.println("Bateria acabou");
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        Cell Cell1 = new Cell();
        Cell1.model = "MotoG";
        Cell1.brand = "motorola";
        Cell1.memory = 32;
        Cell1.color = "Space Grey";

        Cell Cell2 = new Cell();
        Cell2.model = "Poco x3";
        Cell2.brand = "Xiaomi";
        Cell2.memory = 128;
        Cell2.color = "Black";

        Cell Cell3 = new Cell();
        Cell3.model = "Iphone 7";
        Cell3.brand = "Apple";
        Cell3.memory = 32;
        Cell3.color = "Rose";

        Cell1.lowbaterry();

        System.out.println(Cell1.toString());
    }

}
