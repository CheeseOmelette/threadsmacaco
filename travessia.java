
package com.mycompany.macacomonitor;


public class travessia {
    int ponte;
    String nome;
    int esquerda, direita, direcao, macaconum = 10;
      //Direita = 0 || Esquerda = 1
    
    synchronized void atravessando(int direcao, String nome) throws InterruptedException {
        this.direcao = direcao;
       
       
        System.out.println("O " +nome+ " vai tentar atravessar, sua direção é: " +direcao+ " atualmente temos: "+ponte+ " primatas na ponte");
        Thread.sleep(500);
       
        switch(direcao) {
            case 0:
            if (ponte >= 2) {
               
                while (direita >= esquerda && esquerda != 0 ) {
                System.out.println("O " +nome+ " não conseguiu subir na ponte");
                wait();
                }
            
                while (esquerda >= direita && direita != 0) {
                System.out.println("O " +nome+ " não conseguiu subir na ponte");
                wait();
                }
            
                }
            
            
            
                direita++;
                ponte++;
                System.out.println("O " +nome+ " subiu na ponte, agora temos " +direita+ " primatas da direita e "+esquerda+ " da esquerda em cima da ponte");
                break;
            
            case 1:
            if (ponte >= 2) {
                while (direita >= esquerda && esquerda != 0 ) {
                System.out.println("O " +nome+ " não conseguiu subir na ponte");
                wait();
                }
            
                while (esquerda >= direita && direita != 0) {
                System.out.println("O " +nome+ " não conseguiu subir na ponte");
                wait();
                
                }
            
                }
           
                esquerda++;
                ponte++;
                System.out.println("O " +nome+ " subiu na ponte, agora temos " +direita+ " primatas da direita e "+esquerda+ " da esquerda em cima da ponte");
                break;
        } 
            
            switch(direcao) {
                case 0:
                    direita--;
                    ponte--;
                    System.out.println("O " +nome+ " conseguiu atravessar pro outro lado");
                    notify();
                    break;
                case 1:
                    esquerda--;
                    ponte--;
                    System.out.println("O " +nome+ " conseguiu atravessar pro outro lado");
                    notify();
                    break;
                    
            }  
           
           }
            
            
            
            
        }
        
    

