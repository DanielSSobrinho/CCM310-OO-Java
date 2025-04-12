
package com.mycompany.a03e01;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        String nomeLocal;
        String cpfLocal;
        int idadeLocal;
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite o nome da P1: ");
        nomeLocal = teclado.nextLine();
        p1.setNome(nomeLocal);
        
        System.out.println("Digite o CPF da P1: ");
        cpfLocal = teclado.nextLine();
        p1.setCpf(cpfLocal);
        
        System.out.println("Digite a idade da P1: ");
        idadeLocal = teclado.nextInt();
        p1.setIdade(idadeLocal);
        
        System.out.println("Dados PESSOA 1:");
        System.out.println("Nome:  " + p1.getNome());
        System.out.println("CPF:  " + p1.getCpf());
        System.out.println("Idade: " + p1.getIdade());
        
        teclado.nextLine();
        
        Pessoa p2 = new Pessoa();
        
        System.out.println("Digite o nome da P2: ");
        nomeLocal = teclado.nextLine();
        p2.setNome(nomeLocal);
        
        System.out.println("Digite o CPF da P2: ");
        cpfLocal = teclado.nextLine();
        p2.setCpf(cpfLocal);
        
        System.out.println("Digite a idade da P2: ");
        idadeLocal = teclado.nextInt();
        p2.setIdade(idadeLocal);
        
        System.out.println("Dados PESSOA 2:");
        System.out.println("Nome:  " + p2.getNome());
        System.out.println("CPF:  " + p2.getCpf());
        System.out.println("Idade: " + p2.getIdade());
        
        
        Pessoa p3 = new Pessoa();
        
        System.out.println("Digite o nome da P3: ");
        nomeLocal = teclado.nextLine();
        p3.setNome(nomeLocal);
        
        System.out.println("Digite o CPF da P3: ");
        cpfLocal = teclado.nextLine();
        p3.setCpf(cpfLocal);
        
        System.out.println("Digite a idade da P3: ");
        idadeLocal = teclado.nextInt();
        p3.setIdade(idadeLocal);
        
        System.out.println("Dados PESSOA 3:");
        System.out.println("Nome:  " + p3.getNome());
        System.out.println("CPF:  " + p3.getCpf());
        System.out.println("Idade: " + p3.getIdade());
    }
}
