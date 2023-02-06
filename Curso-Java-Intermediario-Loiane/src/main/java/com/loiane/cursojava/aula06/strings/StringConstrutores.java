package com.loiane.cursojava.aula06.strings;

/* String é uma classe.
   Para alocação de memória no Java, esxiste uma diferença quando criamos
   uma variável do tipo String e quando instanciamos uma String.
   Objetos também são variáveis, porém apontam para endereços diferentes
    na memória e ocupam espaços diferentes tb.
*/

public class StringConstrutores {
    public static void main(String[]args)
    {
        String vazia = new String();
        
        String java = new String("Java"); // string construtor
        System.out.println(java);
        
        //criando array de char
        char[] charDoJava = {'a','b', 'c'};
        
        String javaArray = new String(charDoJava);
        System.out.println(javaArray);
        
        char[] abcd = {'a', 'b', 'c', 'd'};
        String abc = new String(abcd, 1,3); // passando o ofSet, para setar o caracter que desejo
        System.out.println(abc);
        
        //arrays de byte. Vai representar um caracter da tabela ascii
        byte[] ascii = {65,66,67,68};
        String abcde = new String(ascii);
        System.out.println(abcd);
        
        // atribuição simples
        String java1 = "Java";
        System.out.println(java1);
    }
}
