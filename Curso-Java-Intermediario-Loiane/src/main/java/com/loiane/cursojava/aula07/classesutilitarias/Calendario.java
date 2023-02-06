
package com.loiane.cursojava.aula07.classesutilitarias;

/*classe Calendar, para trabalhar com datas.
 Já existe um calendário instanciado no Java. Para obter esse calendário, chamamos
 o método getInstance(). Esse método já retorna um new Calendar.
 Esse padrão de já retornar uma instancia e não deixar o usuário instanciar o objeto
 é um padrão de projeto que se chama singleton.*/

import java.util.Calendar;


public class Calendario {
    public static void main(String[]args)
    {
        
        Calendar hoje = Calendar.getInstance(); // singleton
        // executa o toString da classe com infos: dia, mês, dia da semna ... 
        System.out.println(hoje);
        
        // método get onde passamos uma constante para obter infos
        int ano = hoje.get(Calendar.YEAR);
        System.out.println(ano);
        
        int mes = hoje.get(Calendar.MONTH);
        System.out.println(mes);
        
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
       
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        System.out.println(hora);
        
        //mes no Java inicia no zero
        System.out.println(dia + " " + (mes+1) + " " + ano);
        
        // 4 adicionou mais 4 dias com o dia de hoje
        hoje.add(Calendar.DAY_OF_MONTH, 4);
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
        
       
        
        
      
    }
    
}
