/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        //Paso 1. Declaracion de variables (identificadores)
        //En la siguiente linea, le indico a Java que utilizare
        //Un teclado
        double w,l, imc;
        String eIMC;
        Scanner kb = new Scanner (System.in);
        //Paso 2. Asignar valores a variables.
        System.out.println("Introduce el peso");
        w=kb.nextDouble();
        System.out.println("Introduce la estatura");
        l=kb.nextDouble();
        //Paso 3. Resolver el problema.
        imc= w/ Math.pow (l,2);
        //3.1 Evaluamos IMC.
        if (imc>25){
            eIMC= "Sobrepeso";
        }else if (imc<19){
             eIMC="Desnutricion";
                }else{
            eIMC="Normal";
        }
        //Paso 4. Mostrar el resultado.
        System.out.println("Peso= " + w);
        System.out.println("Estatura= " + l);
        System.out.println("IMC="+imc);
        System.out.println(eIMC);
               
         
    }
    
}
