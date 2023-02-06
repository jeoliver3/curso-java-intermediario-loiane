
package com.loiane.cursojava.aula07.classesutilitarias;

// Formatando datas com a classe SimpleDateFormat. Acesar a documentação para
// ver em detalhes todos os formatos

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


public class FormataDate {

    public static void main(String[]args)
    {
        // usando padrão formato ano
        SimpleDateFormat sdf = new SimpleDateFormat("y");
        
        //ano de 2011, dia 13 de fevereiro, às 14:30 e 20 segundos
        Calendar data = new GregorianCalendar(2011,2,13, 14,30,20);
        
        System.out.println(sdf.format(data.getTime()));
        
        // formato data, dia mês e ano e hora, minutos e segundos
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf2.format(data.getTime()));
    
    
    }
}
