
package com.mycompany.a03e02;

import java.util.Scanner;

public class TesteSwapper {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        Swapper troca = new Swapper();
        
        double xLocal, yLocal;
        
        System.out.println("Digite o valor de X: ");
        xLocal = teclado.nextDouble();
        troca.setX(xLocal);
        
        System.out.println("Digite o valor de Y: ");
        yLocal = teclado.nextDouble();
        troca.setY(yLocal);
        
        System.out.println("Valores antes da troca: ");
        System.out.println("X antes da troca: " + troca.getX());
        System.out.println("Y antes da troca: " + troca.getY());
        
        troca.swap();
        
        System.out.println("Valores depois da troca: ");
        System.out.println("X antes da troca: " + troca.getX());
        System.out.println("Y antes da troca: " + troca.getY());
    }
}
