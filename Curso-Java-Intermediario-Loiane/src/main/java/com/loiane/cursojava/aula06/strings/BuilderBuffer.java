package com.loiane.cursojava.aula06.strings;

/*

    String builder - buffer
*/

public class BuilderBuffer {
 public static void main(String[]args)
 {
     String[] letras = {"B", "C", "D"};
     
     String alfabeto = "";
     
     for(String letra : letras)
     {
         alfabeto += letra;
     }
     System.out.println(alfabeto);
     
     /*String buffer - cria uma coleção de strings, onde podemos fazer um append
      de novas stirngs e no final, chamando o método toString, vamos ter uma string única*/    
     StringBuffer sb = new StringBuffer();
     for(String letra : letras)
     {
         sb.append(letra);
     }
     alfabeto = sb.toString();
     System.out.println(alfabeto);
 
     // método reverse, executa a String ao contrário
     System.out.println(sb.reverse());
 
     // StringBuilder - não é Thread-safe
     StringBuilder sb2 = new  StringBuilder();
 }   
}
