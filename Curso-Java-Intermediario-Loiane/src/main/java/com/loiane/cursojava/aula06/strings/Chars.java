package com.loiane.cursojava.aula06.strings;

import java.util.Arrays;


/*
    charAt, getChars, getBytes, toCharArray
*/
public class Chars {
    public static void main(String[]args)
    {
        String java = "Java"; 
        
        for(int i = 0; i < java.length(); i++)
        {
            System.out.print(java.charAt(i));// iterando cada caracter
            
        }
        
        //extrair caracteres desse array com método getChar
        char[] javas = new char[3]; // array de caracter com 3 posições
        java.getChars(0,3 , javas, 0);
        // qual indice do caracter que quero copiar, qual que é o caracter final,
        //qual que é o destino e qual o primeiro indice do caracter
        System.out.println();
        System.out.println(javas);
        
        byte[] javaBytes = new byte[3];
        java.getBytes(0,3,javaBytes,0);
        System.out.println(Arrays.toString(javaBytes));// executa valor da ascii
        
        // transformar String em array de chars
        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);
        
        
    }
    
}
