/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Scanner;

/**
 *
 * @author cchir
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        byte edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su edad: ");
        edad = sc.nextByte();
        edad++;
        System.out.println("El Proximo año su edad sera: " + edad + " años");
        // TODO code application logic here
    }
    
}
