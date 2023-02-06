
package com.loiane.cursojava.aula02.staticimport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


/* 
Todos os métodos na classe Math são estáticos, não precisamos instanciar a classe
Math para serem utilizados.
Através do import static, importamos o a classe Math e o método a ser utilizado.
Dessa forma, não é necessário setar a clase Math, apenas passar o método.
Pode-se também importar Math.* para trazer todos os métodos, mas é uma boa prática
especificar o método para que fique um código legível a título de informação.
*/

public class StaticImport {
    public static void main(String[]args)
    {
        double a = 2;
        double b = 3;
        double c= 4;
        
        //pow - método da classe Math de potência. Eleva o dois a tres
        System.out.println(Math.pow(a, b)); 
        
        // sqrt método da classe Math que calcula raiz quadrada
        System.out.println(Math.sqrt(c));
    
        // Esses outputs são os mesmos do código de cima, dps da importação da classe.
        System.out.println(pow(a, b));
        
        System.out.println(sqrt(c));
        
    }
}
