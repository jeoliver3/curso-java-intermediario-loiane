
package com.loiane.cursojava.aula01.enumeradores;


/*
value e valueOf
values() - método do Enum que retorna um array de todos os valores que estão
dentro do enumerador
*/

public class TesteValue {
    public static void main(String[]args)
    {
    
        DiaSemanaEnum[] dias = DiaSemanaEnum.values();
        for(int i = 0; i < dias.length; i++)
        {
            System.out.println(dias[i]);
        }
        
        //obtendo o valor de um Enum atraves de uma String co valueOf
        
        
        
        System.out.println(Enum.valueOf(DiaSemanaEnum.class, "TERCA"));
        
        
        // Para quando souber o valor da String
        DiaSemanaEnum dia = Enum.valueOf(DiaSemanaEnum.class, "TERCA");
        
        System.out.println(dia);
    }
}
