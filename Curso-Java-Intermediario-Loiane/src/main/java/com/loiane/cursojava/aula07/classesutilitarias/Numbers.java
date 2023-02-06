
package com.loiane.cursojava.aula07.classesutilitarias;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/*
    Classe NumberFormat - para formatar números, sem precisao decimal.
    
*/
public class Numbers {
    public static void main(String[]args)
    {
        Locale en = new Locale("en", "United Stated");
        NumberFormat nf = NumberFormat.getInstance(en);
        
        String num = nf.format(100.99);
        System.out.println(num);
        
        Locale br = new Locale("pt","Brazil");
        nf = NumberFormat.getInstance();
        num = nf.format(100.99);
        System.out.println(num);
        
        
        // Moeda, pasando dos EUA
        NumberFormat moeda = NumberFormat.getCurrencyInstance(en);
        Currency currency = moeda.getCurrency();
        String valor = moeda.format(100.99);
        System.out.println(valor);
       
        
         }
}
