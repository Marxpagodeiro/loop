/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loop;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double Fahrenheit = 0;
        String resp = "";
        do{
            System.out.println("Qual o valor da temperatuda em graus celsios? ");
            celsius = in.nextDouble();
            Fahrenheit = (celsius*1.8)+32;
            System.out.println("A temperatura em graus Fahrenheit é " + Fahrenheit);
            System.out.println("Você deseja continuar calculando o programa? (s/n)");
            resp = in.next();
            
        }while(resp.equals("s"));
    }
}
