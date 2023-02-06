
package com.loiane.cursojava.aula01.enumeradores;


public class TesteDiaSemanaEnum {
    public static void main(String[]args)
    {
        DiaSemanaEnum dia = DiaSemanaEnum.SEGUNDA;
        
        // 
        System.out.println(dia.toString() + " - " + dia.getValor());
        
        Data data = new Data(4, 6, 2023, 2);
        
        System.out.println(data.getAno());
    
    }
    
}

