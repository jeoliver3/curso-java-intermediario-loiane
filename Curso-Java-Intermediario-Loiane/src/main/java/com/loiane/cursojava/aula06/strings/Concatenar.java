package com.loiane.cursojava.aula06.strings;


public class Concatenar {
    public static void main(String[]args)
    {
        String curso = "Curso ";
        String java = "Java";
        System.out.println(curso + java);
        
        // Soma e concatenação. Coisas diferentes.
        String soma = "Resultado de 2+2= " +(2+2);
        System.out.println(soma);
        
        String concatenar = "Resultado de 2+2= " + 2+2;
        System.out.println(concatenar);
        
        //método valueOf, setando o valor que será transformado em String
        String um = String.valueOf(1);
        System.out.println(um);
    }
}
