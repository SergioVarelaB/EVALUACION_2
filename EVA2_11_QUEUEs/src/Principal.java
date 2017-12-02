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
        Queue q1 = new Queue();
        q1.push(new Nodo(10));
        System.out.println(q1.isEmpty());
        q1.push(new Nodo(20));
        q1.push(new Nodo(30));
        q1.peek();
        q1.push(new Nodo(40));
        q1.mEmpty();
        System.out.println(q1.isEmpty());
        for (int i = 1; i < 11; i++) {
            q1.push(new Nodo(i * 10));
        }
        System.out.println("el stack tiene "+q1.countEle()+" elementos");
        q1.imprimirEle();
        q1.pop();
        q1.imprimirEle();
        System.out.println("");
        System.out.println("el stack tiene "+q1.len()+" elementos");
        q1.peek();
        q1.pop();
        q1.peek();
        q1.pop();
        q1.peek();
        q1.pop();
        q1.peek();
    }
    
    
}
class Nodo {

    private int iVal;
    private Nodo nSig;
    private Nodo nPrev;

    public Nodo() {
        iVal = 0;
        nSig = null;

    }

    public Nodo(int iNum) {
        iVal = iNum;
        nPrev = null;
        nSig = null;

    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
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

class Queue {

    Nodo nIni;
    Nodo nFin;
    int len;

    public Queue(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
        len = 0;

    }

    public Queue() {
        nIni = null;
        nFin = null;
        len = 0;

    }
    public void imprimirEle() {
        if (nIni == null) {
            System.out.println("la lista esta vacia");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + "-");
                nTemp = nTemp.getnSig();
            }
        }

    }

    public int countEle() {
        Nodo nTemp = nIni;
        if (nIni == null) {
            return 0;
        } else {
            int iCont = 0;
            while (nTemp != null) {
                iCont++;
                nTemp = nTemp.getnSig();
            }
            return iCont;
        }
    }
    public int len(){
        return len;
    }
    

    public void mEmpty() {
        nIni = null;
        len = 0;

    }
    public boolean isEmpty() {
        if (nIni == null) {
            return true;
        } else {
            return false;
        }
    }
    public void pop(){
        nIni = nIni.getnSig();
        System.out.println("");
        len--;
    }
    public void peek(){
        System.out.println("el primer valor es: "+nIni.getiVal());
    }
    public void push(Nodo nNodo){
          if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
          len++;
    }

}