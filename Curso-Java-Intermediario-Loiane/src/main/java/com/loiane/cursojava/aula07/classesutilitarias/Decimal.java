
package com.loiane.cursojava.aula07.classesutilitarias;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/*
    Classe DecimalFormat - Formatando Números.
    Estende a Classe NumberFormat.
    Com Pattern - define qual padrão vai ser formatado.
    Padrão de prefixo, sufixo, números inteiros , fracionário, expoente ...
    Cada "#"  vai definir um número.
    
*/
public class Decimal {
    public static void main(String[]args){
    
        String padrao = "###,###.##";// padrao brasileiro com virgula
        DecimalFormat df = new DecimalFormat(padrao);
        
        System.out.println(df.format(12345678.55));
        // executa no formato setado na String padrao
        
        String padrao2 = "###,###.##";// padrão americano com ponto
        
        // Classe especial da classe DecimalFormat
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(123456.55));
        
    
        // configurando classe DecimalFormat qual tamanho dp Grop
        String padrao3 = "###,###.##";
        df = new DecimalFormat(padrao3, dfs);
        // seta o número de grupos. Aqui coloquei 4, então vai executar números agrupados a cada 4
        df.setGroupingSize(4);
        System.out.println(df.format(1234567891011.55));
        
    
    
    
    
    }
    
   
}
