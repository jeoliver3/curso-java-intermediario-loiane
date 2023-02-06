
package com.loiane.cursojava.aula05.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MinhaThreadSincronizar  implements Runnable{
   
    
    private String name;
    private int[] num;
    //(instância estática para classe MinhaThreadSincronizar)todas as instâncias dessa classe
    // MinhaThreadSincronizar, irão compartilhar Sincronizar
    private static Sincronizar sinc = new Sincronizar();
    
    public MinhaThreadSincronizar(String name, int[] num)
    {
        this.name = name;
        this.num = num;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        int soma = 0;
        System.out.println("Resultado soma" + this.name + "é" +soma);
        try {
            soma = sinc.somarArray(this.num);
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThreadSincronizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(this.name +"Terminou execução");
    }
}
