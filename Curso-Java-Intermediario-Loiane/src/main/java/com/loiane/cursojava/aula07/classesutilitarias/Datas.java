package com.loiane.cursojava.aula07.classesutilitarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import static java.util.concurrent.TimeUnit.DAYS;

/*
    Datas  partir do Java 8. 
    Ver API Joda-Time (data e hora)
    LocalDate, LocalDateTime, LocalTime, ZoneId, ZoneDateTime.
*/
public class Datas {
    public static void main(String[]args)
    {
        //padrao iso de datas - dd MM yyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        
        System.out.println(LocalDate.of(2023,2, 1));
        
        //data em formato String
        System.out.println(LocalDate.parse("2023-02-03"));
        
        // add mais 30 dias
        System.out.println(agora.plusDays(30));
        
        //subtrai 1 mes
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));
        
        //qual dia da semana é hoje
        System.out.println(agora.getDayOfWeek());
        //qual é o dia do mes
        System.out.println(agora.getDayOfMonth());
        //qual é o dia do ano
        System.out.println(agora.getDayOfYear());
        
        // se esse ano  é um ano bissexto
        System.out.println("é bissexto? " +agora.isLeapYear());
        
        //horário agora
        LocalTime hora =  LocalTime.now();
        System.out.println(hora);
        
        //horário
        System.out.println(LocalTime.of(22, 21));
        System.out.println(LocalTime.parse("22:21"));
    
        //qual é a hora
        System.out.println(hora.getHour());
        
        //data completa = data + hora
        LocalDateTime dataHoraCompleta = LocalDateTime.now();
        System.out.println(dataHoraCompleta);
    
        //fuso horário
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);
        
        
    }
    
}
