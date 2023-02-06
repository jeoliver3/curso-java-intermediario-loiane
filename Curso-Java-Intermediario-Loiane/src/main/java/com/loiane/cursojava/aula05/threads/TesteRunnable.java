package com.loiane.cursojava.aula05.threads;

public class TesteRunnable {
    public static void main(String[]args) throws InterruptedException
    {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread 1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread 2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread 3", 500);


        /*
        essa classe implementa da interface Runnable, não é de fato uma thread.
        Para isso, precisa passar a classe para thread
        */
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
       
        
        /*Método join vai esperar a execução da thread, para só então continuar
         o código. A thread 2 só vai iniciar a execução dela quando a thread 1
        terminar, ou então 200 milissegundos depois que a thread 1 terminar*/
        t1.start();
        t1.join(200);
        
        t2.start();
        
        
        t3.start();
        
        // dando prioridade ao t2 de execução. Que recebe atributo de 1 0 10
        t2.setPriority(10);
        
        System.out.println("Programa Finalizado!");
    }
   }
