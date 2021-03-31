
package br.com.mycompany.poo;

import java.util.Scanner;

public class Mouse {

    String model;
    String brand;
    Integer dpi, dpinow, change=0, dpii;
    Boolean rgb;
    
    void nowdpi(){
        System.out.println("Seu mouse atual e: " + model  );
        System.out.printf("Seu DPI atual e: %d ", (dpinow) );
        System.out.printf("\nO DPI total e: %d ", (dpi), "\n");
        dpii = dpinow;
        changedpi();
        
    }
    void selectdpi(){
        dpii = dpi;
        dpinow = dpi;
        changedpi();
    }    
    void up(){
        if (dpinow < dpi){
            dpinow = dpii + 800;
            nowdpi();
        } else {
            System.out.println("Seu dpi esta no maximo");
            changedpi();
        }
    }
    void down(){
        if (dpinow > 800){
            dpinow = dpii - 800;
            nowdpi();
        } else {
            System.out.println("Seu dpi esta no minimo");
            changedpi();
        }
    }
    void changedpi(){
        System.out.println("\nVoce deseja aumentar ou diminuir o dpi? \n 1 - aumentar 2 - diminuir");
        Scanner ler = new Scanner(System.in);
        change = ler.nextInt();
        if(change == 1){
            up();
        }else if(change == 2){
            down();
           
            }
          
            
            
        }

    
    
    public static void main(String[] args) {

        Mouse Mouse1 = new Mouse();
        Mouse1.model = "G403";
        Mouse1.brand = "Logitech";
        Mouse1.dpi = 16000;
        Mouse1.rgb = true;

        Mouse Mouse2 = new Mouse();
        Mouse2.model = "Pulsefire";
        Mouse2.brand = "HyperX";
        Mouse2.dpi = 6200;
        Mouse2.rgb = true;

        Mouse Mouse3 = new Mouse();
        Mouse3.model = "Storm";
        Mouse3.brand = "Redragon";
        Mouse3.dpi = 12400;
        Mouse3.rgb = true;
        
        Mouse1.selectdpi();
        
        System.out.println(Mouse1.toString());
    }
}
