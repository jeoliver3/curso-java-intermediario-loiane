package com.loiane.cursojava.aula05.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
    - Ciclo de vida das threads: New/Runnable/Waiting/Dead/Running.
    - Criando uma Thread: extender a classe Thread / Implementar interface Runnable
    - 3 métodos mais importantes em uma thread: start(Inicia o método run)
      run(executa a tarefa da thread) sleep(coloca a thread para dormir por alguns
      milissegundos)
      - Quando fazemos extends da Thread, o único método que precisa ser sobreposto
       é o run.
 */
public class MinhaThread extends Thread {

    private String name;

    public MinhaThread(String name) {
        this.name = name;
        //startando a thread chamando método start (que chama o método run)
        start();
    }

    //Para uma thread ser executada é necessário sobrescrever o método run
    @Override
    public void run() {
        System.out.println("Executando a thread");

        //Executando a tarefa da thread e colocando para dormir.
        // a thread executa o for e dorme por  1 segundo
        for (int i = 0; i < 6; i++) {
            System.out.println(name + " contador " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
};
