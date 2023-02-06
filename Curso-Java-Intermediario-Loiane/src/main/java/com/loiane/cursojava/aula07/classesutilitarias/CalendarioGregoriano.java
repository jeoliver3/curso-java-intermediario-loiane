package com.loiane.cursojava.aula07.classesutilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
    GregorianCalendar, subclasse da classe Calendar
*/
public class CalendarioGregoriano {
    
    public static void main(String[]args)
    {
        
        Calendar hoje1 = Calendar.getInstance();
        //não é singleton. precisa ser instanciada
        GregorianCalendar hoje2 = new GregorianCalendar();
        
        imprimirData(hoje1);
        
       
        
        
        
    }
    
    
    private static void imprimirData( Calendar hoje1)
    {
        int ano= hoje1.get(Calendar.YEAR);
        int mes = hoje1.get(Calendar.MONTH);
        int dia = hoje1.get(Calendar.DAY_OF_MONTH);    
        int hora = hoje1.get(Calendar.HOUR_OF_DAY);
        
        System.out.print(dia + " " + (mes+1) + " " + ano);
        
    }
    
}
