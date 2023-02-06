package com.loiane.cursojava.aula01.enumeradores;

/* 
- Utilizando Enumeradores como classes, com construtor, atributos, metodos.
- Enums extends a classe java.lang.Enum
- Podem ser comparados usando o operador ==
- Podem implementar interfaces
- Pode ser declarado separadamente ou dentro de classe
- Não existe herança dentro de Enum

*/

public enum DiaSemanaEnum {
    
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
    
    private int valor;
    
    // construtor sem modificador de acesso
    DiaSemanaEnum(int valor)
    {
        this.valor = valor;
    }
    public int getValor()
    {
        return valor;
    }
    
}
