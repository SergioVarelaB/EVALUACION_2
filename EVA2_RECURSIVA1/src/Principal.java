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
        System.out.println(sumaNums(1593));
    }
    public static int sumaNums(int i){
        int first;
        if(i<10){
            return i;
        }else{
            first=i%10+sumaNums(i/10);
            return sumaNums(first);
        }
    }
}
 