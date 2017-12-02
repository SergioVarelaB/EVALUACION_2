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
        System.out.println(expoR(3,1));
        System.out.println(expoR(3,2));
        System.out.println(expoR(3,3));
    }
    public static int expoR(int base, int ex){
        if (ex==1){
            return base;
        }
        return base*expoR(base,ex-1);
    }
}
