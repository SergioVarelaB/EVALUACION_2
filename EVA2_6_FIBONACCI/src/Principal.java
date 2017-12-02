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
        System.out.println(Fibo(9));
        System.out.println(FiboNoRecursivo(9));
    }
    public static int FiboNoRecursivo(int i){
        int temporal=1,fibo=1,fibo2=1;
        for (int x = 2; x < i; x++) {
            temporal = fibo + fibo2;
            fibo = fibo2;
            fibo2 = temporal;
            }
        return temporal; 
    }
    public static int Fibo(int i){
        if(i==0){
            return 0;
        }
        else if(i==1){
            return 1;
        }
        return Fibo(i-1)+ Fibo(i-2);
    }
    
}
