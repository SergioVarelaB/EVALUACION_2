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
        Factorial(5);
        System.out.println(Factorial(5));
    }
    public static int Factorial(int n){
        if (n>0){ 
        return n*Factorial(n-1);
    }else{
        return 1;    
    }
        
    }
    
}
