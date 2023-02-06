
package com.loiane.cursojava.aula07.classesutilitarias;

// classe TimeZone no Java, trabalha com fuso horário

import java.util.Calendar;
import java.util.TimeZone;


public class FusoHorario {
    public static void main(String[]args)
    {
    
        Calendar calendar = Calendar.getInstance();
        
        // para saber qual fuso horário está sendo utilizada por essa data
        TimeZone tz = calendar.getTimeZone();
        System.out.println(tz);
    
        // para saber quais fusos horarios existem no Java
        String[] fusos = TimeZone.getAvailableIDs();
        
        for(int i = 0; i < fusos.length; i++)
        {
            System.out.println(fusos);
        }
    
        // configurar um fuso padrão
        TimeZone tzSP = TimeZone.getTimeZone("São Paulo");
        System.out.println(tzSP.getID());
        System.out.println(tzSP.getDisplayName());
    
    }
}
