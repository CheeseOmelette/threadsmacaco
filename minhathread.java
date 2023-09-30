
package com.mycompany.questao1macaco;




public class minhathread implements Runnable{
    private String nome;
    travessia TS;
    private int direcao;
    
    
    
    public minhathread(String nome, int direcao, travessia TS){
    this.direcao = direcao;
    this.nome = nome;
    this.TS = TS;

    
    Thread t = new Thread(this);
    
    t.start();
    
    
}
    
    
    
    @Override
    public void run() {
       try {

            TS.atravessando(direcao, nome);
            
        
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
     
       System.out.println("O "+nome + " terminou a execução");        
        
    } 

   
    }
    


   
