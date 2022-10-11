/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[]lados = new double[3];
        int cont = 0;
        while(cont< lados.length){
            System.out.println("digite os lados " + (cont+1));
            lados[cont] =in.nextDouble();
            cont++;
        }
        
    }
    
}
