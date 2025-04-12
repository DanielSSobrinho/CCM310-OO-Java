
package com.mycompany.a03e01;


public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){     
        this.cpf = cpf;
    }
    
    public void setIdade(int idade){
        if (idade < 0 || idade > 150){
            idade = 0;
        }
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
}
