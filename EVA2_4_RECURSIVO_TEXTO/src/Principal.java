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
        //TODO code application logic here
        /*for (int i = 1; i < 10; i++) {
        System.out.println(cadenaRecursiva(i));
        }
        for (int i = 8; i > 1; i--) {
        System.out.println(cadenaRecursiva(i));
        }*/
        System.out.println("*");
        int i =1;
        while(i>0&&i<20){
            if(i<10){
             System.out.println(cadenaRecursiva(i));
            }i++;
            if(i>10){
                System.out.println(cadenaRecursiva(21-i));
            } 
        }
        
    }
    public static String cadenaRecursiva (int iNum ){
        if(iNum>1){
            return "*"+cadenaRecursiva(iNum-1);
        }else{
            return "*";
        }
    }
}
    