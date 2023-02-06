package com.loiane.cursojava.aula06.strings;

/*
    equalsIgnoreCase, regionMatches, startsWith, endsWith, compareTo
*/
public class Comparacao {
    public static void main(String[]args)
    {
        String ola1 = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        
        //equals
        System.out.println("ola1 igual ola2 " +ola1.equals(ola2) ); //false
        System.out.println("ola1 igual ola3 " +ola1.equals(ola3) ); //true
        
        //equalsIgnoreCase
        System.out.println("ola1 igual ola2 " +ola1.equalsIgnoreCase(ola2));//true
        
        //regionMatches - comparando região da String com ofSet
        
        String banana = "banana";
        String ana = "ana";
        String ban = "ban";
        
        System.out.println( banana.regionMatches(1, ana, 0, 3));//true
        System.out.println(banana.regionMatches(1, ana, 1, 2)); // false
        // a partir do caractere 1 vai dar falso pq o caractere 1 não faz match com ana
        
        System.out.println(banana.regionMatches(true, 0, ban,0, 3));
        //true, porque está sendo comprarado o ban com ignoreCase com os 3 caracteres banana
        
        // endsWith (termina com)
        System.out.println(banana.endsWith(ana));// true, porque termina com ana (banana)
        
        // startWith(começa com)
        
        System.out.println(banana.startsWith(ban)); //true, porque começa com ban (banana)
        
        //compareTo  0 quando a é == que b
        String a = "a";
        String b = "b";
        String A = "A";
        
        System.out.println(a.compareTo(b)); // -1 porque a é manor que b
        System.out.println(b.compareTo(a)); // 1 quando a é maior que b
        System.out.println(a.compareTo(a));// 0 quando sao iguais
        System.out.println(a.compareTo(A)); // vai dar 32, que é a diferenca da tabela ascii
        
        
        
        }
}
