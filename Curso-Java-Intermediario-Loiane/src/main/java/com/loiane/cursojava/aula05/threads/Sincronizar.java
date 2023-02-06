package com.loiane.cursojava.aula05.threads;

/*
    Sincronização é o ato de coordenar as atividades de 2 ou mais threads.
    Quando 2 ou mais threads precisam acessar um recurso compartilhado, ou 
    somente 1 thread pode acessar o recurso por vez.
    No Java usamos a palavra reservada synchronized em métodos (assinaturas)ou
    em um bloco de código. Sincronizar um método ou em um bloco de código.
    
*/
public class Sincronizar {
    private int soma;
    public int somarArray(int[] array) throws InterruptedException
    {
        for(int i=0; i< array.length; i++)
        {
            soma += array[i];
            
            Thread.sleep(200);
            
            System.out.println("Executando a soma " + Thread.currentThread().getName() + 
                " somando o valor " + array[i] + "com total" +soma);
        // método currentThread traz a thread atual que está acessando esse recurso
        }
        
        return soma;
    }
    
}
