
package com.loiane.cursojava.aula07.classesutilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

/*
    Resources Bundles - pacotes de recursos 
    Uma forma de utilizar resources bundles é criando arquivos.
    Foi criando um arquivo = meu-texto.properties
    Geralmente é criado na raiz do projeto , no src.
    
    
*/
public class ResourcesJava {
    public static void main(String[]args)
    {
        
        
        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        System.out.println(rb.getString("hello"));
    
    }
}
