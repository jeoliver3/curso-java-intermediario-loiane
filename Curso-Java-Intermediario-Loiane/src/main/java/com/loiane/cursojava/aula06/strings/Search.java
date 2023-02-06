package com.loiane.cursojava.aula06.strings;

/*
    Fazendo buscas em Strings utilizando métodos undexOf, lastIndexOf e contains
*/
public class Search {
    public static void main(String[]args)
    {
        String banana = "banana";
        String ana = "ana";
        
        
        /* indexOf método que significa
         índice de. Busca dentro da Stirng banana um caractere ou outra String e 
         retorna índice desse caractere onde se encontra. Retorna -1 qdo não existe*/
        System.out.println(banana.indexOf('x'));
        
        // vai retornar 0 porque 'b' é o primeiro no índice
        System.out.println(banana.indexOf('b'));
        
        // vai retornar 1 porque 'a' é o índice 1 da String
        System.out.println(banana.indexOf('a')); 
        
        // vai retornar 1 porque o 'a' de ana aparece no indice 1
        System.out.println(banana.indexOf(ana));
        
       
        // lastIndexOf - procura a última vez que o 'a' aparece na String
        System.out.println(banana.lastIndexOf('a')); 
        
        //retorna um boolean. Banana contém ana ? Sim! Retorna true
        System.out.println(banana.contains(ana));
        
    }
}
