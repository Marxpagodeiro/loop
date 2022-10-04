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
        int dv = 0;
        int dd = 0;
        int result = 0;
        System.out.println("Qual o valor do dividendo? ");
        dd = in.nextInt();
        System.out.println("Qual o valor do divisor? ");
        dv = in.nextInt();
        while(dd>=dv){
            dd=dd-dv;
            result++;
            
        }
         System.out.println("resultado " + result);
         System.out.println("resto " + dd); 
    }
    
}
