
package com.mycompany.questao1macaco;


public class Monke   {

    
    public static void main(String[] args) {
        
        travessia TS = new travessia();
      
        //Direita = 0 || Esquerda = 1
     
 
     minhathread rmonkey = new minhathread("macaco vermelho", 0, TS);
    
     minhathread bmonkey = new minhathread("macaco azul", 0, TS);
    
     minhathread gmonkey = new minhathread("macaco verde", 0, TS);
     
     minhathread ymonkey = new minhathread("macaco amarelo", 0, TS);
    
     minhathread pkmonkey = new minhathread("macaco rosa", 0, TS);
     
     minhathread gramonkey = new minhathread("macaco cinza", 1, TS);
     
     minhathread purpmonkey = new minhathread("macaco roxo", 1 , TS);
     
     minhathread tlmonkey = new minhathread("macaco turquesa", 1, TS);
     
     minhathread albmonkey = new minhathread("macaco albino", 1, TS);
     
     minhathread ormonkey = new minhathread("macaco laranja", 1, TS);

     
    }
    
}


