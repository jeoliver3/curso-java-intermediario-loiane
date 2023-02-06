/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula03.escopo;

/**
 *
 * @author bella
 */
public class EscopoDeVariaveis {
   
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int calculaValor(int valor)
    {
        valor = valor + 10;
        return valor;
    
    
    }
    
}
