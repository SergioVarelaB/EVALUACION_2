/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Alberto Varela Bencomo #16550457
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(limp("yyzzza"));
        System.out.println(limp("abbbbcdd"));
        System.out.println(limp("Hello"));
    }
    public static String limp(String frase){
        if(frase.length()==1){
            return frase;
        }
        if(frase.charAt(0)==frase.charAt(1)){
            return limp(frase.substring(1));
        }else{
            return frase.charAt(0)+limp(frase.substring(1));
        }
    }
}
