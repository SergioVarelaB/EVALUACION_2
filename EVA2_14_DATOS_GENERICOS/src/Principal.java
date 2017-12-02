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
        Nodo <Double> nMiNodo = new Nodo(100.2);
        nMiNodo.setiVal(50.2);
        System.out.println(nMiNodo.getiVal());
    }
    
    
}
class Nodo <Friendzone>{
    private Friendzone iVal;
    private Nodo nSig;
    private Nodo nPrev;
    public Nodo(Friendzone nuevoVal){
        iVal = nuevoVal;
        nSig=null;
        nPrev=null;
    }

    public Friendzone getiVal() {
        return iVal;
    }

    public void setiVal(Friendzone iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
    
}