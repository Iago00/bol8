/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8.pkg1;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Porcentaje {
        private int cantidad;
    Scanner teclado=new Scanner(System.in);
    
    public Porcentaje (){
    }
    public Porcentaje (int cant){
        cantidad=cant;
    }
    public void setCantidad (Scanner teclado){
        System.out.println("Escribe la cantidad:");
        cantidad=teclado.nextInt();
    }
    public int getCantidad (){
        return cantidad;
    }
    public void porcentajes (){
        if (cantidad<=500)
            System.out.println("Cantidad: "+cantidad+"\nIncremeto: "+cantidad*50/100+"\nCantidad Final:"+(cantidad+((cantidad*50)/100)));
        else if (cantidad<=1000)
            System.out.println("Cantidad: "+cantidad+"\nIncremeto: "+cantidad*7/100+"\nCantidad Final:"+(cantidad+((cantidad*7)/100)));
        else if (cantidad<=5000)
            System.out.println("Cantidad: "+cantidad+"\nIncremeto: "+cantidad*15/100+"\nCantidad Final:"+(cantidad+((cantidad*15)/100)));
        else System.out.println("Cantidad: "+cantidad+"\nIncremeto: -"+cantidad*3/100+"\nCantidad Final:"+(cantidad-((cantidad*3)/100)));
    }
}
