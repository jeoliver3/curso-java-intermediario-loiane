package com.loiane.cursojava.aula07.classesutilitarias;

/*
    - Classe matemática no Java.

    - Funçoes exponenciais:
        pow.() potência 
        sqrt(x) raiz quadrada
        cbrt(x) raiz cúbica
        exp(x) exponencial
        log(x) logaritmo base 2 log2(x)
        log10(x) logaritmo base 10 log10(x)
        scalb(x,y) fator x*2y

    - Funções arredondamento 
`       abs(x) - número absoluto de x
        ceil(x) - menor número inteiro maior ou igual x
        floor(x) - menor número inteiro menor ou igual x
        floorDiv(x,y) - menor número inteiro menor ou igual quociente x/y
        floorMod(x,y) - menor número inteiro menor ou igual resto x/y
        round(x) - arredonda x
        max(x,y) - retorna o maior número: x ou y
        min(x,y) - retorna o menor número: x ou y
        nextAfter(x,y) - próximo número inteiro depois de x em direção a y
        nextDown(x) - próximo número inteiro depois de x (>= java 8)
        nextUp(x) - próximo número inteiro depois de x (>= java 8)

        - Funções para o operaçøes matemáticas:
        addExact(x,y) - x+y (>= java 8)
        subtractExact(x,y) - x-y (>= java 8)
        multiplyExact(x,y) - x*y (>= java 8)
        incrementExact(x) - x+1
        decrementExact(x) - x-1
        random() - n;umero aleatório entre 0 e 1
        toRadians(x) - converte um grau em radiano
        toDegrees(x) - converte um radiano em grau


*/
public class ClasseMath {
    public static void main(String[]args)
    {
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.round(4.6)); //acima de  4.5 arredonda para 5
        System.out.println(Math.round(4.4)); // menor que 4.5 arredonda para baixo
        System.out.println(Math.ceil(4.4));
        System.out.println(Math.floor(4.4));
        System.out.println(Math.floor(4.7));
        // gerar um núumero aleatório e arredonda
        System.out.println(Math.round(Math.random()));
        // gera número aleatório até 100
        System.out.println(Math.round(Math.random() * 100));
        System.out.println();
    }
}
