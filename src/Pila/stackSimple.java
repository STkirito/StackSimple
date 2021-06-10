/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import java.util.Scanner;

/**
 *
 * @author kirito
 */
public class stackSimple {
    Scanner teclado = new Scanner(System.in);
    private String pila[];
    private int tope=-1;
    private int control;
    private int contador=1;
    //Función definir Tamaño de la pila
    public void tamañoMax(int tamaño){
    pila=new String[tamaño];
    control=tamaño;
    }
    //Función total de elementos
    public String size(){
    return Integer.toString(pila.length);
    }
    //Función ultimo elemento
    public void peek(){
        String pilaU[]=new String[pila.length];
        for(int tope=pila.length-1;tope>=0;tope--){
            if(pila[tope] !=""){
                pilaU[tope] = pila[tope];
            }
        }
        if(control >0){
            if(pilaU[control-1]!="" && pilaU[control-1] != null){
            System.out.println("Ultimo: "+pilaU[control-1]);
            }
        }else{
             System.out.println("Pila Vacia");
        }  
    }
    //Función agregar elementos a la pila(int)
    public int push(){
        if(tope>=pila.length-1){
            System.out.println("la pila está llena");
        }else
        {
            tope+=1;
            System.out.println("ingrese el dato");
            pila[tope]=teclado.nextLine();
        return tope;
 
        }
        return tope;
    }
    //Función quitar ultimo Elemento
    public void pop(){
        if(pila.length-contador >=0){
            pila[pila.length-contador]=null;
            contador++;
            control--;
        }else{
            System.out.println("Pila Vacia");
        } 
    }
    //Función ver los elementos de la pila
    public void ver(){
        int controlver=0;
        for(int tope=pila.length-1;tope>=0;tope--){
            if(pila[tope]!=null){
            System.out.println("Datos de la pila: "+ pila[tope]);
            }else{
            controlver=1;
            }
        }
        if(controlver ==1){
            System.out.println("Pila Vacia");
        }
    } 
}
