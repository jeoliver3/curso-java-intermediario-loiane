package com.loiane.cursojava.aula04.varargs;

/*
- Varargs é utilizado quando não se sabe quantos parâmetros vão ser passados no método.
- A partir do Java 5 foi add o Varargs, que permite passar parâmetro direto para 
o método, através dos ..., que indica infinitos parâmetros. 
- Varargs aceita somente parâmetros que são classes.
A diferença do tipo vetor array para Varargs é na hora de utilizar. Quando for
chamado no output 
*/
public class Varargs {
    public static void main(String[]args)
    {
    
        int vetor[] = {1,2,3,4,5};
        System.out.println(soma(vetor));
        
        // Varargs
        System.out.println(soma(1,2,3,4,5,6,7,8,9,10));
        
        
    
    }
    
    static int soma(int[] vetor)
    {
        int total=0;
        for(int i=0; i<vetor.length;i++)
        {
            total+= vetor[i];
        }
        return total;
    }
    
    static int soma(Integer... vetor)
    {
        
        int total=0;
        for(int i=0; i<vetor.length;i++)
        {
            total+= vetor[i];
        }
        return total;
    }
    
}
