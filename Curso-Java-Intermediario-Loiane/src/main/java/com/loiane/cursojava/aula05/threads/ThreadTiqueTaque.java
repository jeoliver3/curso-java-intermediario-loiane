
package com.loiane.cursojava.aula05.threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadTiqueTaque implements Runnable {
    
    TiqueTaque tt;
    Thread t;
    
    final int NUM = 5;
    
    public ThreadTiqueTaque(String name, TiqueTaque tt)
    {
        this.tt = tt;
        t = new Thread(this,name);
        t.start();
    }

    @Override
    public void run() {
        
        if(t.getName().equalsIgnoreCase("Tique"))
        {
            for(int i = 0; i< NUM; i++)
            {
                tt.tique = (true);
                
            }
            try {
                tt.tique(false);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            else
            {
                   for(int i = 0; i< NUM; i++)
                    {
                       try {
                           tt.taque(true);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(ThreadTiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
                       }
                    }
                 
            
            try {
                tt.taque(false);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
            } 
                    }
            
        }
        
}
