package com.loiane.cursojava.aula05.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
    - Criando thread utilizando a interface Runnable
    - Quando implementamos Runnable, também precisamos implementar o método run
    - Com a classe Runnable, podemos extender qq outra classe
    - Se não for sobrepor qq outro método da classe Thread, pode ser melhor usar
        a classe Runnable
*/
public class MinhaThreadRunnable implements Runnable {
    private String name;
    private int time;
    
    public MinhaThreadRunnable(String name, int time)
    {
        this.name = name;
        this.time = time;
        
    }

    @Override
    public void run() {
        
        for(int i =0; i<6; i++)
        {
            System.out.println(name+" contador " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThreadRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Terminou a execução");
    }
    
}
