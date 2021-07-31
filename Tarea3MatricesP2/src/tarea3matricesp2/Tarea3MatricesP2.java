/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3matricesp2;

import java.util.Scanner;

/**
 *
 * @author USUARIOTC
 */
public class Tarea3MatricesP2 {
    public static Scanner sn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    //Variables globales 
    private static int fila;
    private static int columna;
    private static String [][] Matriz;
    
    //Funcion principal 
    public static void main(String[] args) {
        IngresoMa();
        LlenarMatriz(Matriz);
                
        ImprimirMatriz(Matriz);
    }
    
    //Metodos
    public static String [][]IngresoMa(){
        columna = 4;
        System.out.print("Ingrese el numero de filas: ");
        fila=sn.nextInt();
        return Matriz = new String [fila][columna];  
    }
    
    public static void LlenarMatriz(String [][] matriz){
        String nombre, mes1, mes2, mes3, total;
        for (int f=0; f<Matriz.length;f++ ){
            for (int c=0; c<Matriz[0].length; c++){
               System.out.print("Ingrese datos: ");
               nombre=sn.nextLine();
               Matriz[f][0]=nombre;
               
            }
            
        }
    }
    public static void ImprimirMatriz(String [][] matriz){
        for (int f=0; f<Matriz.length;f++ ){
            for (int c=0; c<Matriz[0].length; c++){
                System.out.print(Matriz[f][c]);
            }
            System.out.print("\n");
        }
    }
}

