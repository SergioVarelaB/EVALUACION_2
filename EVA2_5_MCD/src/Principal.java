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
        System.out.println("el MCD es: "+gcd(180,48));
        System.out.println("el MCD es: "+gcd(48,180));
        System.out.println("el MCD es: "+gcd(23,17));
        System.out.println("el MCD es: "+gcd(23,0));
    }
    public static int gcd (int dividendo, int divisor){
        int reciduo;
        if(divisor == 0){
            return dividendo;
        }else{
            reciduo = dividendo%divisor;
            return gcd(divisor, reciduo);
        } 
    }
}
