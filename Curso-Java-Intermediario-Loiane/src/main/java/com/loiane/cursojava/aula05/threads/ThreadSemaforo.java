package com.loiane.cursojava.aula05.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSemaforo implements Runnable {

    public CorSemaforo getCor() {
        return cor;
    }

    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemaforo() {
        this.cor = CorSemaforo.VERDE;
        this.parar = false;
        this.corMudou = false;

        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!parar) {
            try {
                switch (this.cor) {
                    case VERMELHO: {

                        Thread.sleep(1000);
                        break;
                    }
                    

                    case VERDE: {

                        Thread.sleep(2000);
                        break;
                    }

                    case AMARELO:

                        Thread.sleep(300);
                        break;
                }
                
                mudarCor();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSemaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    // mudar a cor
    private synchronized void mudarCor()
    
    {
        switch(this.cor)
        {
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case VERDE: 
                this.cor = CorSemaforo.AMARELO;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
          
        }
        
        this.corMudou = true;
        notify();
    }
    public synchronized  void esperarCorMudar() throws InterruptedException
    {
        while(!this.corMudou)
        {
            wait();
        }
        this.corMudou = false;
    }
    
    public synchronized void desligarSemaforo()
    {
        this.parar = true;
    }
}
