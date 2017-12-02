
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try {
            ListaDE miLista = new ListaDE();
            System.out.println(miLista.listaVacia());
            miLista.imprimirEle();
            miLista.agregarN(new Nodo(15));
            miLista.imprimirEle();
            System.out.println("");
            miLista.agregarN(new Nodo(30));
            miLista.imprimirEle();
            System.out.println("");
            miLista.agregarN(new Nodo(45));
            miLista.imprimirEle();
            System.out.println("");
            System.out.println(miLista.find(45));
            miLista.borrar(2);
            miLista.imprimirEle();
            System.out.println("");
            miLista.insert(1, new Nodo(1234));
            miLista.imprimirEle();
            System.out.println("");
            System.out.println("el valor en la posicion 2 es: " + miLista.valorEn(2));
            System.out.println("el tamaño de la lista es: " + miLista.countEle());
            System.out.println("la lista esta vacia? " + miLista.listaVacia());
            miLista.vaciarLista();
            System.out.println("la lista esta vacia? " + miLista.listaVacia());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
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

class ListaDE {

    Nodo nIni;
    Nodo nFin;

    public ListaDE(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;

    }

    public ListaDE() {
        nIni = null;
        nFin = null;

    }

    public void agregarN(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
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

    public void imprimirEleInv() {
        if (nIni == null) {
            System.out.println("la lista esta vacia");
        } else {
            Nodo nTemp = nFin;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + "-");
                nTemp = nTemp.getnPrev();
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

    public void vaciarLista() {
        nIni = null;

    }

    public void insertar(int pos, Nodo nNodo) {
        if (pos == 0) {
            nNodo.setnSig(nIni);
            nIni = nNodo;

        }

    }

    public void borrar(int pos) {
        if (pos == 0) {
            nIni = nIni.getnSig();
        } else {
            Nodo temp = nIni;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getnSig();
            }
            temp.setnSig(temp.getnSig().getnSig());
            if (temp.getnSig() == null) {
                nFin = temp;
            }
        }

    }

    public int find(int val) {
        int count = 0;
        int index = -1;
        Nodo temp = nIni;
        while (temp != null) {
            if (val == temp.getiVal()) {
                index = count;
                break;
            }
            temp = temp.getnSig();
            count++;
        }
        return count;
    }

    public int valorEn(int iPos) throws Exception {
        int iVal = 0;
        if (iPos < countEle() && iPos >= 0) {
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            iVal = nTemp.getiVal();
        } else {
            throw new Exception("La posicion no es valida");
        }
        return iVal;
    }

    public void insertarEn(int iPos, Nodo nNodo) {//no utilizar
        if (iPos > countEle() || iPos < 0) {
            System.out.println("La posicion no es valida");
        } else if (iPos == countEle()) {
            agregarN(nNodo);
        } else {
            Nodo temp = nIni;
            if (iPos == 0) {
                nNodo.setnSig(nIni);
                nIni.setnPrev(nNodo);
                nIni = nNodo;
            } else {
                for (int i = 0; i < iPos - 1; i++) {
                    temp = temp.getnSig();
                }
                temp.getnSig().setnPrev(nNodo);
                nNodo.setnSig(temp.getnSig());
                nNodo.setnPrev(temp);
                temp.setnSig(nNodo);
            }
        }
    }

    public void insert(int iPos, Nodo nNodo) {
        //verificar iPos < tamaño lista
        if (iPos == 0) {
            nNodo.setnSig(nIni);
            nIni = nNodo;
        } else { //insertar en cualquier posicion menos la final
            Nodo nTemp = nIni;
            for (int i = 0; i < (iPos - 1); i++) {
                nTemp = nTemp.getnSig();
            }
            nNodo.setnSig(nTemp.getnSig());
            nTemp.setnSig(nNodo);

        }
    }

    public boolean listaVacia() {
        if (nIni == null) {
            return true;
        } else {
            return false;
        }
    }

}

