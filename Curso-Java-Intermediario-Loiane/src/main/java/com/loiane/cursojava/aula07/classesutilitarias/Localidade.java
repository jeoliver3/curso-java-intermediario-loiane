
package com.loiane.cursojava.aula07.classesutilitarias;

import java.util.Locale;

/*
    Locale - Classe que vai representar diferentes formatos de infos 
dependendo de onde voce estiver.

*/
public class Localidade {
    
    public static void main(String[]args)
    {
        Locale locale = Locale.getDefault();
        //executa o locale padrão que está o seu conputador. Nas configuraçoes do meu SO
        //coloquei para ser em ingles
        System.out.println(locale);
        
        // infos que mostra os locais que estão disponíveis nas APIS.
        // com o método getAvailableLocales. iterando o array para trazer infos
        Locale[] locales = Locale.getAvailableLocales();
        for(int i=0; i<locales.length; i++)
        {
           // System.out.println("Nome: " +locale.getDisplayName());
            //System.out.println("Código da língua " + locale.getLanguage());
        }
    
        //criando um locale passando no construtor
        Locale br = new Locale("pt", "Brazil");
        System.out.println(br);
        
        //setando br como locale padrão
        Locale.setDefault(br);
        System.out.println(Locale.getDefault());
    
    }
}
