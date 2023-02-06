
package com.loiane.cursojava.aula07.classesutilitarias;

import java.util.Date;


public class Data {
    
    public static void main(String[]args)
    {
        Date hoje = new Date();
        
        // traz  o dia, mês, hora e ano atual
        System.out.println(hoje);
        
        //retorna a quantidade de milissegundos desde 1 jan de 1970
        System.out.println(hoje.getTime());
        
       
        
        
    }
}
