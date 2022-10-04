/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class Loop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = 0;
        int menor = 0;
        int maior = 1;
        int prox = 0;
        System.out.println("Qual o valor de X ");
        X = in.nextInt();
        while(maior<=X){
            prox = maior+menor;
            menor=maior;
            maior=prox;
            prox=maior+menor;
        }
        if(X == prox){
            System.out.println("O numero pertence a sequencia de Fibonacci .");
            
        }else{
           System.out.println(" O maior numero de fibonacci menor que X é " + menor); 
        } 
    }
    
}
