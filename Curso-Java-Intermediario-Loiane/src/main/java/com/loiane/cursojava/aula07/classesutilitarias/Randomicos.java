
package com.loiane.cursojava.aula07.classesutilitarias;

// numeros aleatorios no Java, com método Random

import java.util.Random;

public class Randomicos {
    public static void main(String[]args)
    {
        // gera número aleatório
        System.out.println(Math.random());
        // setando numeros  de 0 a 10 - funciona bem com as dezenas, centenas ...
        System.out.println(Math.random() * 10);
        // setando numeros  de 0 a 10 e  arredonda com floor
        System.out.println(Math.floor(Math.random() * 10));
        
        Random aleatorio = new Random();
        // para numeros de 0 a 5 
        System.out.println(aleatorio.nextInt(5 + 1));
        // numero aleatorio inteiro, numero esse que o Java consegue armazenar
        // NextLong para numeros maiores e NextDouble para decimais
        System.out.println(aleatorio.nextInt());
    
    }
}
