
package com.loiane.cursojava.aula06.strings;

// extraindo token da String, para obter infos com StringTokenizer.
// muito utilizado em leitura de arquivos com Java

import java.util.StringTokenizer;


public class Token {
        public static void main(String[]args){

            String deAlgumArquivo = "1;Antonio;30;";
            
        // primeiro parâmetro qual a string que queremos extrair as infos e
        // segundo parâmetro o delimitador. Nesse caso é o ; que está separando as infos
            StringTokenizer st = new StringTokenizer(deAlgumArquivo, ";");
            
            /* enquanto o StringTokenizer tiver mais tokens, com nextToken, extrai
            as infos*/
            while(st.hasMoreTokens())
            {
                System.out.println(st.nextToken());
            }
                    
    
    
}
}