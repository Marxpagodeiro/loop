/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int num = 0;
       int cont = 0;
       int div = 2;
       System.out.println("informe o numero? ");
       num = in.nextInt();
       while(div <= (num/2)+1){
           if(num%div == 0){
               
               cont++;
           }
           div++;
       }
       if(cont == 0){
           System.out.println("é primo");
       }else{
           System.out.println("não é primo");
       }
  
    }
}
