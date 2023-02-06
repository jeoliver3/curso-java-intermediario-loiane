
package com.loiane.cursojava.aula05.threads;

public class TiqueTaque {
    boolean tique;
    
   synchronized  void tique(boolean estaExecutando) throws InterruptedException
    {
        if(!estaExecutando)//se não estiver executando
        {
            tique = true;
            notify(); // método que notifica (vai notificar a outra thread - taque)
            return;
        }
        System.out.print("Tique");
        
        tique = true;
        notify();
        
        while(tique)
        {
            // enquanto for tique, vamos esperar(wait) pela execução.
            
            wait(); 
            
        }
        
    }
   
   synchronized  void taque(boolean estaExecutando) throws InterruptedException
    {
        if(!estaExecutando)//se não estiver executando
        {
            tique = false;
            notify(); 
            return;
        }
        System.out.println("Taque");
        
        tique = false;
        notify();
        
        while(!tique)
        {
            wait(); 
            
        }
    }
}
