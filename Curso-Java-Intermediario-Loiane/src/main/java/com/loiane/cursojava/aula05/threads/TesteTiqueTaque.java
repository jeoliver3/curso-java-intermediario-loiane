package com.loiane.cursojava.aula05.threads;

public class TesteTiqueTaque {

    public static void main(String[]args) throws InterruptedException
    {
        TiqueTaque tt = new TiqueTaque();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
     
        try{
       tique.t.join();
       taque.t.join();
        }
        catch(InterruptedException e){
        }
        
        
    }
}
