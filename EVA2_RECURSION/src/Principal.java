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
        System.out.println(paresP("()"));
        System.out.println(paresP("(())"));
        System.out.println(paresP("(((x))"));
    }
    public static boolean paresP(String parentesis){
        if(parentesis.length()==0){return true;}
        if(parentesis.charAt(0)=='('){
            if (parentesis.charAt(parentesis.length()-1)==')') {
                return paresP(parentesis.substring(1,parentesis.length()-1));
            }
        }
            return false;
    }
    
}
