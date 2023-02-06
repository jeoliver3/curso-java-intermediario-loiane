
package com.loiane.cursojava.aula06.strings;

/*
    Métodos join e split - junta e separa Strings
*/
public class JuntaSepara {
    public static void main(String[]args)
    {
    
        /* join - método que faz parte da classe String. Passando elementos
         do tipo varargs, separados por vírgulas. Junta tudo.*/
        String alfabeto = String.join(", ", "A", "B", "C");
        System.out.println(alfabeto);
    
        // método split - separa Strings. Com regex, foi separado com vírgula e eespaço
        String[] letras = alfabeto.split(", ");
        
        for(String letra : letras)
        {
            System.out.println(letra);
        }
    
    }
    
}
