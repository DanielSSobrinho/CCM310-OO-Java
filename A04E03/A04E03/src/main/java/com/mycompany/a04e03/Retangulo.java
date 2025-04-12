
package com.mycompany.a04e03;

public class Retangulo {
    private int x1, x2, x3, x4, y1, y2, y3, y4;
    public int comprimento, largura, perimetro;

    
    //SET
    
    public void setX1(int x1) {
        if(x1 < 20){
            this.x1 = x1;
        }
        
    }

    public void setX2(int x2) {
        if(x2 < 20){
            this.x2 = x2;
        }
        
    }

    public void setX3(int x3) {
        if(x3 < 20){
            this.x3 = x3;
        }
        
    }

    public void setX4(int x4) {
        if(x4 < 20){
            this.x4 = x4;
        }
        this.x4 = x4;
    }

    public void setY1(int y1) {
        if(y1 < 20){
            this.y1 = y1;
        }
        
    }

    public void setY2(int y2) {
        if(y2 < 20){
            this.y2 = y2;
        }
        
    }

    public void setY3(int y3) {
        if(y3 < 20){
            this.y3 = y3;
        }
        
    }

    public void setY4(int y4) {
        if(y4 < 20){
            this.y4 = y4;
        }
        
    }
    
    //GET

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

    public int getX4() {
        return x4;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }

    public int getY4() {
        return y4;
    }
    
    public void verificaQuadrante(){
        if(x1 < 0 || x2 < 0 || x3 < 0 || x4 < 0 || 
                y1 < 0 || y2 < 0 || y3 < 0 || y4 < 0){
            System.out.println("Não está no primeiro quadrante!!!");
        }
    }
    
    public void verificaRertangulo(){
        if(x1 == x3 && x2 == x4 && y1 == y2 && y3 == y4){
            System.out.println("Se trata de um retângulo!");
        }
    }
    
    public void calcComprimento(){
        comprimento = y1 - y2;
        System.out.println("Comprimento: " + comprimento);
    }
    
    public void calcLargura(){
        largura = x2 - x1;
        System.out.println("Largura: " + largura);
    }
    
    public void calcPerimetro(){
        perimetro = (comprimento * 2) + (largura * 2);
        System.out.println("Perímetro: " + perimetro);
    }

    @Override
    public String toString() {
        return "Retangulo{" + "x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3 + ", y4=" + y4 + ", comprimento=" + comprimento + ", largura=" + largura + ", perimetro=" + perimetro + '}';
    }
    
    
    
    
    
}
