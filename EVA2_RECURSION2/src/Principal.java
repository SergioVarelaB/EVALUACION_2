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
        System.out.println("'"+wtX("xaxb")+"'");
        System.out.println(wtX("'"+"abc"+"'"));
        System.out.println(wtX("'"+"xx"+"'"));
    }
    public static String wtX(String frase){
        if(frase.equals("")) return "";//frase==""
        if(frase.charAt(0)=='x'){
            return wtX(frase.substring(1));
        }else{
            return frase.charAt(0)+ wtX(frase.substring(1));
        }
    }
}