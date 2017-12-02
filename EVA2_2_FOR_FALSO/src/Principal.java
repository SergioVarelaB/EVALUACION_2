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
        // TODO code application logic here\
        //imprimir los nums del 5 al 1
        for (int i = 5; i >= 1; i--) {
            System.out.println("i = "+i);
            
        }
        ImprimirRecursivo(10);
        System.out.println("");
        ImprimirRecursivoInv(5,1);
        System.out.println("");
    }
    public static void ImprimirRecursivo (int n){
        System.out.print(n+"-");//Accion a ejecutar
        if (n>1) ImprimirRecursivo(n-1);//Condicion y llamada recursiva
    }
    public static void ImprimirRecursivoInv (int n,int p){
        System.out.print(n+"-");//Accion a ejecutar
        if (n>p) ImprimirRecursivoInv(n-1 ,p);//Condicion y llamada recursiva
    }
    
}
