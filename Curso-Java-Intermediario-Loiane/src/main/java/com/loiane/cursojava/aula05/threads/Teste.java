
package com.loiane.cursojava.aula05.threads;


public class Teste {
    public static void main(String[]args)
    {
        MinhaThread thread = new MinhaThread("Thread n1");
        
        //Multithreads sendo executadas ao mesmo tempo
        
       MinhaThread thread2 = new MinhaThread("Thread n2");
    }
}
