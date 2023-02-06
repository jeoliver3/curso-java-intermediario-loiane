
package com.loiane.cursojava.aula06.strings;


/*
    Métodos para modificar Strings - substring, concat, replace, trim.
    Métodos importantes para serem utilizados em integração de sistemas.

*/

public class Modificar {
    public static void main(String[]args)
    {
        String teste = "Isso é um  teste";
        System.out.println(teste);
        
        /* pedaço de uma String com método substring. Apenas informativo
        substring 10 - vai executar teste, que é o índice 10 de ínicio*/
        System.out.println(teste.substring(10));
        
        // de 10 a 15 seria do início até fim 14
        System.out.println(teste.substring(10, 15));
    
        // método concat - concatena. Não é muito utilizado no dia a dia
        String ola = "olá";
        String mundo = " mundo";
        System.out.println(ola.concat(mundo));
        
        /*método replace - pega o caractere que está errado e coloca no primeiro
        parametro, e no segundo o caractere o correto e executa consertado.*/
        String espacos = " i s p a c o s";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);
        
        
        /* replaceAll - método para retirar os espaços, passando um regex - no caso um espaço
        e no segundo parametro passa  uma string vazia. vai remover os espaços*/
        System.out.println(semEspacos.replaceAll(" ", ""));
        
        //método trim, para remover os espaços que estiverem sobrando
        String nome = " meu nome é: ";
        System.out.println(nome.trim());
        
    }
}
