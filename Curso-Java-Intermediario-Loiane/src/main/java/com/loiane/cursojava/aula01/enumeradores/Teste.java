
package com.loiane.cursojava.aula01.enumeradores;

/**
 *
 * @author bella
 */
public class Teste {

    public static void main(String[] args) {

        usandoConstantes();
        
        System.out.println();
        
        usandoEnum();
        
        
    }
    
    private static void usandoConstantes()
    {
        int segunda = DiaSemanaConstantes.SEGUNDA_FEIRA;
        int terca = DiaSemanaConstantes.TERCA_FEIRA;
        int quarta = DiaSemanaConstantes.QUARTA_FEIRA;
        int quinta = DiaSemanaConstantes.QUINTA_FEIRA;
        int sexta = DiaSemanaConstantes.SEXTA_FEIRA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;
        
        System.out.println("Teste utilizando constantes no Java");
        
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
        
        
    }
    
    
    private static void imprimeDiaSemana(int dia)
    {
        switch(dia)
                {
                    case 1:
                    System.out.println("Segunda-feira");
                    break;
                    case 2: 
                    System.out.println("Terça-feira");
                    break;
                    case 3: 
                    System.out.println("Quarta-feira");
                    break;
                    case 4: 
                    System.out.println("Quinta-feira");
                    break;
                    case 5: 
                    System.out.println("Sexta-feira");
                    break;
                    case 6: 
                    System.out.println("Sábado");
                    break;
                    case 7: 
                    System.out.println("Domingo");
                    break;
                    
                }
        
        // Em Enum, o tipo, pode ser ele mesmo. 
        
    }
    
     private static void usandoEnum()
        {
            DiaSemana segunda = DiaSemana.SEGUNDA;
            DiaSemana terca = DiaSemana.TERCA;
            DiaSemana quarta = DiaSemana.QUARTA;
            DiaSemana quinta = DiaSemana.QUINTA;
            DiaSemana sexta = DiaSemana.SEXTA;
            DiaSemana sabado = DiaSemana.SABADO;
            DiaSemana domingo = DiaSemana.DOMINGO;
            
            System.out.println("Utilizando Enum no Java");
            
        imprimeDiaSemana(DiaSemana.SEGUNDA);
        imprimeDiaSemana(DiaSemana.TERCA);
        imprimeDiaSemana(DiaSemana.QUARTA);
        imprimeDiaSemana(DiaSemana.QUINTA);
        imprimeDiaSemana(DiaSemana.SEXTA);
        imprimeDiaSemana(DiaSemana.SABADO);
        imprimeDiaSemana(DiaSemana.DOMINGO);
            
           
        
    }
     
     // Pssando no case o próprio Enum
     private static void imprimeDiaSemana(DiaSemana dia)
    {
        switch(dia)
                {
                    case SEGUNDA:
                    System.out.println("Segunda-feira");
                    break;
                    case TERCA: 
                    System.out.println("Terça-feira");
                    break;
                    case QUARTA: 
                    System.out.println("Quarta-feira");
                    break;
                    case QUINTA: 
                    System.out.println("Quinta-feira");
                    break;
                    case SEXTA: 
                    System.out.println("Sexta-feira");
                    break;
                    case SABADO: 
                    System.out.println("Sábado");
                    break;
                    case DOMINGO: 
                    System.out.println("Domingo");
                    break;
                    
                }
}

}